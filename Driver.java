public class Driver{ 
public static void main(String[] args) {
BankAccount broke = new BankAccount(10.00, 12345, "stopbuyinghalalfood");
System.out.println(broke);
System.out.println("Balance: " + broke.getBalance());
System.out.println("Account ID: " + broke.getAccountID());
}
}