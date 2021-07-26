package com.FuntionalEstructuralParadigm;

import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        String string1;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite cadena de texto");
        string1=input.nextLine();  // h o l a
        String string2="";
        int longer = string1.length();   // 4
        for(int i =longer; i > longer-longer; i--){    // i = 3 |  i=3-3=0
            int subin = i-1;
            string2=string2+string1.substring(subin, i);
        }
        System.out.println("Ud digito "+string1);
        System.out.println("Ahora la cadena es "+string2);
    }
}
