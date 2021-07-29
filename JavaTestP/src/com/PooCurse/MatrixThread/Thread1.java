package com.PooCurse.MatrixSum;

public class Thread1 extends Thread{
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("G");    
            try {
                Thread.sleep(1000);
            } catch (InterruptedException te) {
                System.out.println(" EL ERROR FUEEE → " +te);
            }
        }
    }
}