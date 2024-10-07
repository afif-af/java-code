
package com.mycompany.assignment35;
public class Main {
    public static void main(String[] args) {
          
        batsman b=new batsman("Mahmudullah","Mymensingh","012345","Batsman",2340,80);
         
          b.display();
         System.out.println(b.calculateAvarage()); 
         System.out.println(b.toString());
         
        bowler bow=new bowler("Mosaddek","Mymensingh","1234","Bowler",10000,50);
         bow.display();
        System.out.println(bow.calculateAvarage()); 
        
         System.out.println(bow.toString());
         
        System.out.println();
    }
    
}
