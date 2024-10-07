
package com.mycompany.assingment1;

public class rectangleArea {
    private double l;
    private double b;
    public rectangleArea(double l,double b)
    {
        this.l=l;
        this.b=b;
    }
    public double area()
    {
        return l*b;
    }
    
   public double perimeter()
   {
       return 2*(l+b);
   }
    public static void main(String[] args) {
        rectangleArea r1=new rectangleArea(4,5);
        rectangleArea r2=new rectangleArea(3,7);
        
        System.out.println("Ractangle Area r1 : "+r1.area());
        System.out.println("Ractangle Area r1 : "+r1.perimeter());
        System.out.println("Ractangle Area r2 : "+r2.area());
        System.out.println("Ractangle Area r2 : "+r2.perimeter());
    }
}
