package Task_7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("John Devis" , "AC101", 5000);
        Account account2 = new Account("Alex Santos", "AC102",1250);
        Account account3 = new Account("Elna Rudi", "AC202", 20000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList <Account> accounts = bank.getAccounts();
        for (Account account: accounts){
            System.out.println(account.getAccountInfo());
        }

        System.out.println("\nafter depositing 2000 $ into account1");
        bank.depositMoney(account1,2000);
        System.out.println(account1.getAccountInfo());

        System.out.println("\n No transaction in account2");
        System.out.println(account2.getAccountInfo());

        System.out.println("\nafter withdrawing 5000 $ from account3");
        bank.withdraw(account3,5000);
        System.out.println(account3.getAccountInfo());

    }
}
