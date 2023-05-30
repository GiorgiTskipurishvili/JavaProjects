package Task_7;

public class Account {
    /**Write a Java program to create a class called "Bank" with a collection of accounts
     *  and methods to add and remove accounts, and to deposit and withdraw money.
     *  Also define a class called "Account" to maintain account details of a particular
     *  customer.**/

    private String name ;
    private String accountNum;
    private double balance;

    public Account(String name, String accountNum, double balance){
        this.name = name;
        this.accountNum =accountNum;
        this.balance = balance;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getAccountNum(){
        return accountNum;
    }
    public void setAccountNum(String accountNum){
        this.accountNum = accountNum;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }

    public String getAccountInfo(){
        return "Name: " + name + ", Account Number: " + accountNum + ", Balance: " + balance;
    }
}
