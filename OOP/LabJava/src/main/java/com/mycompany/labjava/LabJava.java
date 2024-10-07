/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labjava;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class LabJava {

    public static void main(String[] args) {
        
        System.out.println("Enter your Number ");
        Scanner input=new Scanner(System.in);
                int n=input.nextInt();
                int tem=n;
                int sum=0;
                int rem;
                while(tem!=0)
                {
                    rem=tem%10;
                    int fact=1;
                    for(int i=1;i<=rem;i++)
                    {
                        
                        fact=fact*i;
                    }
                    sum+=fact;
                    tem=tem/10;
                }
               if(sum==n)
               {
                   System.out.println("strong Number");
               }
               else
               {
                   System.out.println("Not ");
               }
    }
}
