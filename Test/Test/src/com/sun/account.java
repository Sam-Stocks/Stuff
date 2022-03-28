package com.sun;

import java.util.*;
import java.lang.Math;
public class account {
    int balance;
    int lastTransaction;
    String customerName;
    String customerID;
    Scanner depositeAmount;

    account(String cid) {
        customerID = cid;
    }

    void deposite(int amount) {
        if (amount != 0){
            balance = balance + amount;
            lastTransaction = +amount;
        } else {
            System.out.println("You can't deposite $0 stupid");
        }
    }

    void withdraw(int amount) {
        if (amount != 0 & balance - amount > 0) {
            balance = balance - amount;
            lastTransaction = -amount;
        } else {
            System.out.println("You can't withdraw $0 stupid");
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
        boolean exit = false;
        System.out.println();
        System.out.println("Welcome to the United Bank of MON-EE");
        System.out.println("Your bankID is " +customerID);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposite");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");
        while (!exit) {
            System.out.println();
            System.out.println("What do you want to do?");
            char iChose = choise.next().charAt(0);
            iChose = Character.toUpperCase(iChose);
            System.out.println();

            switch (iChose) {

                case 'A':
                    System.out.println("=============================");
                    System.out.println("      You have $" + Math.abs(balance));
                    System.out.println("=============================");
                    System.out.println();
                    break;
                case 'B':
                    Scanner deposite = new Scanner(System.in);
                    System.out.println("How much do you want to deposite?");
                    deposite(Integer.parseInt(deposite.next()));
                    System.out.println();
                    break;
                case 'C':
                    Scanner withdraw = new Scanner(System.in);
                    System.out.println("How much do you want to withdraw?");
                    withdraw(Integer.parseInt(withdraw.next()));
                    System.out.println();
                    break;
                case 'D':
                    System.out.println("=============================");
                    System.out.println("      " + getLastTransaction());
                    System.out.println("=============================");
                    System.out.println();
                    break;
                case 'E':
                    System.out.println("Thank you for your buisnes");
                    exit = true;
                    choise.close();
            }
        }
    }
}
