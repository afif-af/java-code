
package com.mycompany.assignment2;

public class manager extends member{
    String specialization;
    String department;
    
   void m(String Na,int ag,String ph,String Add,double Sal,String spr,String de)
    {
        Name=Na;
        age=ag;
        phone_number=ph;
        Address=Add;
        Salary=Sal;
        specialization=spr;
        department=de;
    }
    void display()
    {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phone_number);
        System.out.println("Address: " + Address);
        System.out.println("Department: " + department);
    }
    
}
