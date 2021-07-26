package com.PooCurse.Atm;

public class User {
    private int Balance = 2000;
    private String Password;
    
    public User(){}

    public String getPassword(){
        String temporalPassword=this.Password;
        return temporalPassword;
    }

    public int getBalance(){
        int temporalBalance=this.Balance;
        return temporalBalance;
    }

    public void setBalance(int temporalBalance){
        this.Balance=temporalBalance;
    }
}
