
package com.mycompany.assingment34;

public class main {
    public static void main(String[] args) {
        
        System.out.println("Current Account ");
        currentAccount ca=new currentAccount("Rakib",5445,16000);
        ca.deposite(1400);
        ca.withdraw(400);  
        System.out.println("interest of current account "+ca.calculate());
        
        System.out.println("Savings Account ");
        savingsAccount sv=new savingsAccount("Afif",545,10000);
        sv.deposite(1000);
        sv.withdraw(400);
        System.out.println("interest of saving account "+sv.calculate());
    }
    
}
