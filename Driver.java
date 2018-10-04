public class Driver{ 
public static void main(String[] args) {
BankAccount broke = new BankAccount(10.00, 12345, "stopbuyinghalalfood");
System.out.println(broke);
System.out.println("Balance: " + broke.getBalance());
System.out.println("Account ID: " + broke.getAccountID());
broke.setPassword("changingyourpasswordwillnothelp");
System.out.println("New password: " + broke.getPassword());
System.out.println("Account ID and balance: " + broke.toString());
if (broke.deposit(100.00)) {
System.out.println("Transaction successful.");
} else {
System.out.println("Transaction failed.");
}
if (broke.deposit(-100.00)) {
System.out.println("Transaction successful.");
} else {
System.out.println("Transaction failed.");
}
System.out.println("New balance: " + broke.getBalance());
if (broke.withdraw(50.00)) {
System.out.println("Transaction successful.");
} else {
System.out.println("Transaction failed.");
}
if (broke.withdraw(10000.00)) {
System.out.println("Transaction successful.");
} else {
System.out.println("Transaction failed.");
}
if (broke.withdraw(-30.00)) {
System.out.println("Transaction successful.");
} else {
System.out.println("Transaction failed.");
}
System.out.println("New balance: " + broke.getBalance());
BankAccount rich = new BankAccount(100000.00, 54321, "keepbuyinghalalfood");
if (broke.transferTo(rich, 500.00, "whatisyourpassword")) {
System.out.println("Transaction successful.");
} else {
System.out.println("Transaction failed.");
}
if (broke.transferTo(rich, 500.00, "keepbuyinghalalfood")) {
System.out.println("Transaction successful.");
} else {
System.out.println("Transaction failed.");
}
if (broke.transferTo(rich, 10.00, "keepbuyinghalalfood")) {
System.out.println("Transaction successful.");
} else {
System.out.println("Transaction failed.");
}
System.out.println("Balance of 12345: " + broke.getBalance());
System.out.println("Balance of 54321: " + rich.getBalance());
}
}