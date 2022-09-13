package InstanceOf_And_DownCasting;

public class Example_DownCasting_Using_Instanceof
{
    public static void main (String [] args)
    {
        Animal1 a=new Dog3(); // upcasting hoye downcasting hocche

        Dog3.method(a);
    }
}
class Animal1 { }

class Dog3 extends Animal1
{
    static void method(Animal1 a)
    {
        if (a instanceof Dog3)
        {
            Dog3 d = (Dog3) a;//downcasting
            System.out.println("ok downcasting performed");
        }
    }
}