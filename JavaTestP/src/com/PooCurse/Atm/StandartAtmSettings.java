package com.PooCurse.Atm;

import java.util.Scanner;

public class StandartAtmSettings {
    private Scanner input;
    private String inputmemory;
    private int menuOption, limitAmount = 1000;
    protected static int codeAuth = 0;

    public StandartAtmSettings() {

    }

    public void CardRequest() {
        System.out.println("Please enter your card \n Press 1 to continue");
        input = new Scanner(System.in);
        inputmemory = input.nextLine();
        if (inputmemory.equals("1")) {
            codeAuth = 1;
        }
    }

    public int MenuAtm() {
        System.out.println(
                "Select an option: \n  1. Consult your balance\n  2.Takeout money\n  3.Send Money\n  4.Leave ATM");
        input = new Scanner(System.in);
        inputmemory = input.nextLine();
        switch (inputmemory) {
            case "1":
                menuOption = 1;
                break;
            case "2":
                menuOption = 2;
                break;
            case "3":
                menuOption = 3;
                break;
            case "4":
                menuOption = 4;
                break;
            default:
            System.out.println("error............................................");
                menuOption = 0;
                break;
        }
        return menuOption;
    }

    public void ConsultBalance(User instance) {
        int userBalance = instance.getBalance();
        System.out.println("Your balance is $" + userBalance);
    }

    public int TakeMoney(User instance) {
        Boolean stateTransaction = false;
        int newBalance = 0;
        System.out.println("How much money you want take from your Account");
        input = new Scanner(System.in);
        int transactionAmount = input.nextInt();
        if (transactionAmount < instance.getBalance() && transactionAmount <= limitAmount) {
            stateTransaction = true;
            newBalance = instance.getBalance() - transactionAmount;
            System.out.println("Please take the bills");
        } else {
            System.out.println("You dont have enough money");
            stateTransaction = false;
        }
        return newBalance;
    }

    public int SendMoney(User instance) {
        Boolean stateTransaction = false;
        int newBalance = 0;
        System.out.println("How much money you want send from your Account");
        input = new Scanner(System.in);
        int transactionAmount = input.nextInt();
        System.out.println("Type the number account to which you want to send the money");
        int transactionAccount = input.nextInt();
        if (transactionAmount < instance.getBalance()) {
            System.out.println("Transatcion succesfull, you deposited " + transactionAmount + " dollars to the account"
                    + transactionAccount);
            newBalance = instance.getBalance() - transactionAmount;
        } else {
            System.out.println("You dont have enough money");
            stateTransaction = false;
        }
        return newBalance;
    }

    public void AlterUserBalance(int amount, User instance){
        instance.setBalance(amount);
    }
}
