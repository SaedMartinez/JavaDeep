package com.PooCurse.Advanced;

public class Hanoi {
    public static void main(String[] args) {
        Hanoi instance = new Hanoi();
        instance.torresHanoi(3, 1, 2, 3);
    }

    public void torresHanoi(int discos, int torre1, int torre2, int torre3) {
        if (discos == 1) {
            System.out.println("Mover de torre " + torre1 + " a torre  " + torre3);
        } else {
            torresHanoi(discos-1, torre1, torre3, torre2);
            System.out.println("Mover de " + torre1 + " a " + torre3);
            torresHanoi(discos-1, torre2, torre1, torre3);
        }
    }
}
