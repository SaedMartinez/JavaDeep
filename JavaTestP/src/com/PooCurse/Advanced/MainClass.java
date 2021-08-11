package com.PooCurse.Advanced;

public class MainClass {
    public static void main(String[] args) {
        TailList instance= new TailList();
        instance.InNode(4);
        instance.InNode(5);
        instance.InNode(6);
        instance.InNode(7);
        instance.PrintTail();
    }
}
