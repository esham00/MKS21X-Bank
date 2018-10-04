public class Driver {
   public static void main(String[] args) {
     BankAccount cash = new BankAccount( 4980, 1000.10, "password123" );
     System.out.print( "Balance: " + cash.getBalance() + "\nAccount ID: " + cash.getAccountID() + "\nPassword: " + cash.getPassword());
     cash.setPassword("newpassword123");
     //toString test + changing password test
     System.out.print("\n" + cash + "\t" + cash.getPassword());
     if (cash.withdraw(30000)) {
       System.out.print ("\nWithdrawal succeeded" + ", Balance is now " + cash.getBalance());
     }
     else {
       System.out.print ("\nWithdrawal failed");
     }
     if (cash.withdraw(10)) {
       System.out.print ("\nWithdrawal succeeded" + ", Balance is now " + cash.getBalance());
     }
     else {
       System.out.print ("\nWithdrawal failed");
     }
     if (cash.deposit(20000)) {
       System.out.print("\nDeposit succeeded, Balance is now " + cash.getBalance());
     }
     else {
       System.out.print("\nDeposit failed");
     }
     if (cash.deposit(-10)) {
       System.out.print("\nDeposit succeeded, Balance is now " + cash.getBalance());
     }
     else {
       System.out.print("\nDeposit failed");
     }
  }
}
