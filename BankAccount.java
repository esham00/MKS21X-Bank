public class BankAccount {
	private double balance;
	private int accountID;
	private String password;
	public BankAccount(double money, int ID, String pass) {
		accountID = ID;
		balance = money;
		password = pass;
	}
	public double getBalance() {
		return balance;
	}
	public int getAccountID() {
		return accountID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String newPass) {
		password = newPass;
	}
	public String toString() {
		return accountID + "\t" + balance;
	}
	public boolean deposit(double amount) {
		if (amount >= 0) {
			balance += amount;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
	private boolean authenticate(String pass) {
		if (password == pass) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean transferTo(BankAccount other, double amount, String password) {
		if (this.authenticate(password)) {
			if (this.withdraw(amount) && this.deposit(amount)) {
				this.balance -= amount;
				other.balance += amount;
				return true;
			}
			else {
				return false;
			}
		}
		else {return false;}
	}
}
