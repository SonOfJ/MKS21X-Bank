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
public void setPassword(String password) {
this.password = password;
}
}
