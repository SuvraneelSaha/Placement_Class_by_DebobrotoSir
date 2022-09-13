package InstanceInitializerBlock;
// rogram of instance initializer block that is invoked after super()

public class Invoked_After_Super {
    public static void main(String args[]){
        B2 b=new B2();
    }
}
class A
{
    A(){
        System.out.println("parent class constructor invoked");
    }
}
class B2 extends A
{
    B2()
    {
        super(); // this super will be the first to be invoked
        // ie Super Class Constructor will be Invoked First
        System.out.println("child class constructor invoked");
    }

    {
        System.out.println("instance initializer block is invoked"); // Instance Initializer Block
        // Instance Initializer Block is always invoked after the Super Class Constructor

    }
}