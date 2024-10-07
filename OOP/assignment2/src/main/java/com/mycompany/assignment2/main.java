
package com.mycompany.assignment2;

public class main {
    public static void main(String[] args) {
        
        Employee obj= new Employee();
        obj.e("Afif",22,"1234567890","Mymensingh",8000.0,"Software Development");
        obj.display();
        obj.printSalary();
        manager obj1 = new manager();
        obj1.m("Mozzammal",22,"9876543210","Mymensingh",5000.0,"Marketing");
        obj1.display();
        obj1.printSalary();
       
    
    }
    
}
