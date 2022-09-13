package Polymorphism_Runtime_And_CompileTime;
/*
In this example,
 we are creating two classes Bike and Splendor.
  Splendor class extends Bike class and overrides its run() method.
   We are calling the run method by the reference variable of Parent class.
   Since it refers to the subclass object and subclass method overrides the Parent class method,
    the subclass method is invoked at runtime.

Since method invocation is determined by the JVM not compiler, it is known as runtime polymorphism.
 */
public class O3_Example_Of_RuntimePolymorphism {

    public static void main(String args[]){
        Bike b = new Splendor();//upcasting
        b.run();
    }

}
class Bike{
    void run(){System.out.println("running");}
}
class Splendor extends Bike
{
    void run() {
        System.out.println("running safely with 60km");
    }
}