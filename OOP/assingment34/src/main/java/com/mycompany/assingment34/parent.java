
package com.mycompany.assingment34;
public abstract class parent {
    private String name;
    private int account_no;
     double balance;
    abstract double calculate();
    parent( String name,int account_no,double balance)       
    {
        this.name=name;
        this.account_no=account_no;
        this.balance=balance;
    }
     void deposite(double amount)
     {
         balance+=amount;
         System.out.println("deposite amount is: "+amount+" Ac Balance is  :"+balance);
     }
     void withdraw(double amount)
     {
         balance-=amount;
         System.out.println("wthidrow amount is :"+amount+" Ac Balance is :"+balance);
     }
    
}
