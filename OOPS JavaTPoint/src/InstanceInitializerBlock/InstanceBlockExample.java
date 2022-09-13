package InstanceInitializerBlock;

public class InstanceBlockExample {
    public static void main(String args[]) {
        B3 b1 = new B3();
        B3 b2 = new B3(10);
    }
}
class A1
{
    A1()
    {
        System.out.println("parent class constructor invoked");
    }
}

class B3 extends A1
{
    B3() {
        super(); // this super will be the first to be invoked
        // ie Super Class Constructor will be Invoked First  for Each OBJECT
        System.out.println("child class constructor invoked");
    }

    B3(int a)
    {
        super();// this super will be the first to be invoked
        // ie Super Class Constructor will be Invoked First for Each OBJECT
        System.out.println("child class constructor invoked " + a);
    }

    {
        System.out.println("instance initializer block is invoked");
    }
}