package com.mycompany.assingment1;
import java.lang.Math;
public class triangle {
    private double x;
    private double y;
    private double z;
    void getdata(int s1,int s2,int s3)
    {
       x=s1;
       y=s2;
       z=s3;
    }
    public double area()
    {
        double perimeter= x+y+z;
        double s = perimeter /2;
        double area =(float) Math.sqrt(s*(s-x)*(s-y)*(s-z));
        return area;
    }
    public double perimeter()
    {
        double perimete= x+y+z;
        return perimete;
    }
    public static void main(String[] args) {
        triangle tri= new triangle();
        tri.getdata(3, 4, 5);
        double ar =tri.area();
        double pa =tri.perimeter();  
        System.out.println("Area of the triangle: " + ar);
        System.out.println(pa);
    }
  
}
