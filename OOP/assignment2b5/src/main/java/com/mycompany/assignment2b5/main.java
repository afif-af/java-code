
package com.mycompany.assignment2b5;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        subClass obj=new subClass();
        int a=input.nextInt();
        int b=input.nextInt();
        obj.i=a;
        obj.j=b;
        obj.printNum();
        
    }
    
}
