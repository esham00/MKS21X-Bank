public class Driver {
   public static void main(String[] args) {
     BankAccount cash = new BankAccount( 4980, 1000.10, "password123" );
     System.out.print( "Balance: " + cash.getBalance() + "\nAccount ID: " + cash.getAccountID() + "\nPassword: " + cash.getPassword());
     cash.setPassword("newpassword123");
     //toString test + changing password test
     System.out.print("\n" + cash + "\t" + cash.getPassword());

  }
}
