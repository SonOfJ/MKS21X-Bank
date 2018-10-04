public class BankAccount{
private double balance;
private int accountID;
private String password;
public BankAccount(double balance, int accountID, String password) {
this.balance = balance;
this.accountID = accountID;
this.password = password;
}
public double getBalance() {
return balance;
}
public int getAccountID() {
return accountID;
}
public void setPassword(String newpassword) {
password = newpassword;
}
public String toString() {
return accountID + "\t" + balance;
}
public String deposit(double amount) {
if (amount > 0) {
balance = balance + amount;
return "Operation success!";
}
return "Invalid amount";
}
public String withdraw(double amount) {
if (amount > 0) {
if (amount <= balance) {
balance = balance - amount;
return "Operation success!";
}
return "Insufficient funds";
}
return "Invalid amount";
}
}