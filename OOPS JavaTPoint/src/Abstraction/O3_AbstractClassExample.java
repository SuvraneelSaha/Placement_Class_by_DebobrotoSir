package Abstraction;
/*
Example of Abstract class that has an abstract method

 */
public class O3_AbstractClassExample {
    public static void main(String args[]) {
        Bike obj = new Honda4(); // upcasting
        obj.run();
    }
}
abstract class Bike
{
    abstract void run();
}
class Honda4 extends Bike
{
    void run()
    {
        System.out.println("running safely");
    }
}