
package com.mycompany.assingment34;

public class currentAccount extends parent{
    currentAccount( String name,int account_no,double balance)
    {
        super( name,account_no,balance);
    }
    double calculate()
    {
        return balance+balance*0.06;
    }
    
}
