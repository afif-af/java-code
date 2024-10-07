
package com.mycompany.assingment3;

public class Student {
    private int  ID;
    private double score;
    Student(int Id,double score )
    {
        this.ID=Id;
        this.score=score;
        
    }
   
    public void display()
    {
        System.out.println("Id :"+ID);
        System.out.println("Score :"+score);
    }
    
    
}
