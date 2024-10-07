package com.mycompany.assingment1;
import java.util.Scanner;
public class twodArry {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
           System.out.println("Enter the Row and column of the array:");
          int r=input.nextInt();
          int c=input.nextInt();
          int[][]arry=new int[r][c];
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                
                arry[i][j] = input.nextInt();
            }
        }
         int sum=0;
           for (int i=0;i<r;i++) 
           {
             for (int j=0;j<c;j++) 
             { 
                
                if (arry[i][j]%4==0||arry[i][j]%7==0)
                   {
                      
                      sum=sum+arry[i][j];
                    }
             }
           }
        System.out.println(" sum is "+sum);
    }
    
}
