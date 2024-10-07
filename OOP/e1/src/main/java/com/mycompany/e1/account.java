
package com.mycompany.e1;
public abstract class account {
    
    private String name;
    private int ac_no;
    double balance;
    account(String name,int ac_no,double balance)
    {
        
        this.name=name;
        this.ac_no=ac_no;
        this.balance=balance;
    }
    public void deposite(double amount)
    {
        balance+=amount;
        System.out.println(balance+" "+amount);
    }
    public void withdraw(double amount)
    {
        balance-=amount;
        System.out.println(balance+" "+amount);
    }
    abstract double cla();
    
    
    
}
