
package com.mycompany.labtestjava2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        sub ob=new sub();
        ob.i=a;
        ob.j=b;
        ob.printNum();
                
    }
    
}
