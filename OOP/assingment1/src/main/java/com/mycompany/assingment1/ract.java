
package com.mycompany.assingment1;

import java.util.Scanner;

public class ract {
    public static void main(String[] args) { 
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Fist two value :");
        double w=input.nextDouble();
        double x=input.nextDouble();
        System.out.println("Enter second two value :");
        double y=input.nextDouble();
        double z=input.nextDouble();
        rectangle r1=new rectangle(w,x);
        rectangle r2=new rectangle(y,z);
        System.out.println("R1 area : "+ r1.Area() + " perimeter " + r1.pe());
        System.out.println("R1 area : "+ r2.Area() + " perimeter " + r2.pe());
    }
}
