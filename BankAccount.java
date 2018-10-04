public class BankAccount {
	private double balance;
	private int accountID;
	private String password;
	public BankAccount(int ID, double money, String pass) {
		accountID = ID;
		balance = money;
		password = pass;
	}
	public double getBalance() {
		return balance;
	}
	public int accountID() {
		return accountID;
	}
	public void setPassword(String newPass) {
		password = newPass;
	}
	public String toString() {
		return accountID + "\t" + balance;
	}
	public boolean deposit(double amount) {
		if (amount >= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean withdraw(double amount) {
		if (amount <= balance) {
			return true;
		}
		else {
			return false;
		}
	}
}
