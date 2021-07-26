package com.PooCurse.Atm;

import java.util.Scanner;

public class Atm extends StandartAtmSettings{
    static User userInstance = new User();
    public static void main(String[] args) {
        Atm atmIsntance = new Atm();
        atmIsntance.CardRequest();
        if (StandartAtmSettings.codeAuth == 1) {
            int menuOption =0;
            do {
                menuOption=atmIsntance.MenuAtm();
                if (menuOption == 1) {
                    atmIsntance.ConsultBalance(userInstance);
                    menuOption=0;   
                }else if (menuOption == 2) {
                    int newBalance = atmIsntance.TakeMoney(userInstance);
                    atmIsntance.AlterUserBalance(newBalance, userInstance);
                    menuOption=0;   
                }else if (menuOption == 3){
                    int newBalance = atmIsntance.SendMoney(userInstance); //POLYFORMISM
                    atmIsntance.AlterUserBalance(newBalance, userInstance);
                    menuOption=0;
                }else if (menuOption == 4){
                    System.out.println("¿Are you sure that want cancel the transaction, (Y)es/(N)o?");
                    Scanner input = new Scanner(System.in);
                    String askUser=input.nextLine();
                    if (askUser.equals("y")) {
                        menuOption=1;   
                    }else{
                        menuOption=0;   
                    }
                }
            } while (menuOption ==0);
            System.out.println("TRANSACTION CANCELED");
        }else{
            System.out.println("Error of auth, TRANSACTION CANCELED");
        }
    }
}
