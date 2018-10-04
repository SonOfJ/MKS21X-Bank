public class Driver{ 
public static void main(String[] args) {
BankAccount broke = new BankAccount(10.00, 12345, "stopbuyinghalalfood");
System.out.println(broke);
System.out.println("Balance: " + broke.getBalance());
System.out.println("Account ID: " + broke.getAccountID());
broke.setPassword("changingyourpasswordwillnothelp");
System.out.println("Account ID and balance: " + broke.toString());
System.out.println(broke.deposit(100.00));
System.out.println(broke.deposit(-100.00));
System.out.println("New balance: " + broke.getBalance());
System.out.println(broke.withdraw(50.00));
System.out.println(broke.withdraw(10000.00));
System.out.println(broke.withdraw(-30.00));
System.out.println("New balance: " + broke.getBalance());
}
}