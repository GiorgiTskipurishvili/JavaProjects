package Task_7;

import java.util.ArrayList;

public class Bank {
    /**Write a Java program to create a class called "Bank" with a collection of accounts
     *  and methods to add and remove accounts, and to deposit and withdraw money.
     *  Also define a class called "Account" to maintain account details of a particular
     *  customer.**/

    private ArrayList <Account> accounts;

    public Bank(){
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }
    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public void depositMoney(Account account, double amount){
        account.deposit(amount);
    }
    public void withdraw(Account account, double amount){
        account.withdraw(amount);
    }

    public ArrayList <Account> getAccounts(){
        return accounts;
    }
}
