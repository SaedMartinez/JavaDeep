package com.PooCurse.Advanced;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        int NodeInfo = 0;
        TailList instance = new TailList();
        do {
            try {
                System.out.println("menu \n\n 1. Insert Node\n 2. Pull Node\n 3. Print Tail\n 4. Quit");
                option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Type the CHARACTER to add on the TailList");
                        NodeInfo = input.nextInt();
                        instance.InNode(NodeInfo);
                        break;
                    case 2:
                        if (!instance.BlankTail()) {
                            System.out.println(" Extracted the Node :" + instance.GetNode());
                        } else {
                            System.out.println("The Tail its blank ");
                        }
                        break;
                    case 3:
                        instance.PrintTail();

                        break;
                    case 4:
                        option = 4;
                        break;
                    default:
                        System.out.println("ERROR try again");
                        break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        } while (option != 4);
    }
}
