package com.FuntionalEstructuralParadigm;

public class FEPKnowledge {
    public static void main(String[] args) {

    }
    // ALT+94 to POTENCIA , priority 1.()  2.^  3. */  4.+-
     int number1, number2, result ;
    private  void ElevateNumber() {
        number1 = 3;
        number2 = 2;
        result = number1 * number2;
    }


    // Logic operators && = and , || = or
    private void Compare() {
        number1 = 3;
        number2 = 2;
        if (number1 > 0 && number2 < number1) {
            boolean result = true;
        }else{
            boolean result = false;
        }
    } 

    //String Methods - to incremental variable +=
    private void MakeStrings() {
        String word1 = "CADENA";
        String word2 = "";
        word2 =  word1.substring(0, 3); // Print since C to E char
    }



}
