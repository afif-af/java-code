
package com.mycompany.assingment3;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in) ;            
        Student s[] =new Student[3];
        
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter id");
            int id = input.nextInt();
                System.out.println("Enter score");
            double score=input.nextDouble();
                    
                 s[i]=new Student(id,score);
        }
            
        for (int i = 0; i < 3; i++) {
            
             s[i].display();
        }
       
        
    }
    
}
