
package com.mycompany.assignment2;

public class Employee extends member{
    String specialization;
    String department;
    void e(String N,int a,String p,String Ad,double Sa,String sp,String d)
    {
        Name=N;
        age=a;
        phone_number=p;
        Address=Ad;
        Salary=Sa;
        specialization= sp;
        department=d;
    }
    
    void display()
    {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phone_number);
        System.out.println("Address: " + Address);
        System.out.println("Specialization: " +specialization);
    }
   
    
    
}
