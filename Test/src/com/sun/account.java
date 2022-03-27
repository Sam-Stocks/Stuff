package com.sun;

import java.util.*;
public class account {
    int balance;
    int lastTransaction;
    String customerName;
    String customerID;
    Scanner depositeAmount;

    account(String cname, String cid) {
        customerName = cname;
        customerID = cid;
    }

    void deposite(int amount) {
        if (amount != 0){
            balance = balance + amount;
            lastTransaction = -amount;
        } else {
            System.out.println("You can't deposite $0 stupid");
        }
    }

    String getLastTransaction() {
        String output;
        if (lastTransaction > 0) {
            output = "Deposited: $" + lastTransaction;
        } else {
            output = "Withdrew: $" + lastTransaction;
        }
        return output;
    }

    void chooser() {
        Scanner choise = new Scanner(System.in);
        System.out.println("Welcome " + customerName);
        System.out.println("Your bankID is " +customerID);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposite");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println();
        while (true) {
            System.out.println();
            System.out.println("What do you want to do?");
            char iChose = choise.next().charAt(0);
            iChose = Character.toUpperCase(iChose);
            System.out.println();

            switch (iChose) {

                case 'A':
                    System.out.println("=============================");
                    System.out.println("      You have $" + balance);
                    System.out.println("=============================");
                    System.out.println();
                    break;
                case 'B':
                    Scanner amount = new Scanner(System.in);
                    System.out.println("How much do you want to deposite?");
                    deposite(Integer.parseInt(amount.next()));
                    System.out.println();
                    break;
                case 'C':
                    System.out.println("=============================");
                    System.out.println("      " + getLastTransaction());
                    System.out.println("=============================");
                    System.out.println();
                    break;




            }
        }

        


    }
}
