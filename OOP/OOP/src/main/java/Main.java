
public class MyClass1 {
    int x = 50;
}

public class MyClass2 extends MyClass1 {
    int x = 40; 
}

public class Main {
    public static void main(String[] args) {
        MyClass1 ob1 = new MyClass1();
        System.out.println(ob1.x); 

        MyClass2 ob2 = new MyClass2(); 
        System.out.println(ob2.x); 

        MyClass1 ob3 = new MyClass2();
        System.out.println(ob3.x);
    }
}
