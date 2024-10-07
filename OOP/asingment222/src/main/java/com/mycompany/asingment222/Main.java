
package com.mycompany.asingment222;

public class Main {
    public static void main(String[] args) {
        
        Employee employee=new Employee();
        
        employee.Name = "Afif ";
        employee.age = 22;
        employee.phoneNumber = "01635311290";
        employee.Address = "123 Mymensingh";
        employee.Salary = 5000.0;
        employee.specialization = "Java Developer";
        employee.department="Computer Science ";
        
        System.out.println("Name: " +employee.Name);
        System.out.println("Age: " +employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.Address);
        employee.printSalary();
        System.out.println("Specialization: " +employee.specialization);
        System.out.println("Department: " + employee.department);
        
        System.out.println();
        System.out.println();
        
        Manager manager=new Manager();
        manager.Name = "Mozzammal";
        manager.age = 22;
        manager.phoneNumber = "01796343826";
        manager.Address = "125 Mymensingh";
        manager.Salary = 5000.0;
        manager.specialization = "Marketing";
        manager.department="MBA ";
        
        System.out.println("Name: " +manager.Name);
        System.out.println("Age: " +manager.age);
        System.out.println("Phone Number: " +manager.phoneNumber);
        System.out.println("Address: " + manager.Address);
        employee.printSalary();
        System.out.println("Specialization: " +manager.specialization);
        System.out.println("Department: " + manager.department);
        
        
    }
    
}
