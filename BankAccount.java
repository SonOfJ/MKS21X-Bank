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
public String getPassword() {
return password;
} 
public String toString() {
return accountID + "\t" + balance;
}
public boolean deposit(double amount) {
if (amount > 0) {
balance = balance + amount;
return true;
}
return false;
}
public boolean withdraw(double amount) {
if (amount > 0) {
if (amount <= balance) {
balance = balance - amount;
return true;
}
return false;
}
return false;
}
private boolean authenticate(String password) {
if (this.password.equals(password))
return true;
return false;
}
public boolean transferTo(BankAccount other, double amount, String password) {
if (other.authenticate(password) && withdraw(amount)) {
other.deposit(amount);
return true;
}
return false;
}
}