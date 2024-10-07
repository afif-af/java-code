
package com.mycompany.e1;

public class curr extends account{
    curr(String name,int ac_no,double balance)
    {
        super(name,ac_no,balance);
    }
    public double cla()
    {
        return balance+balance*0.06;
    }
    
}
