package FinalKeyword;

public class O3_Final_Class {
    public static void main(String args[]){
        Honda2 honda= new Honda2();
        honda.run();
    }
}
final class Bike2 // final classes cannot be inherited
{
     void run(){System.out.println("running");}
}

class Honda2 //extends Bike2 // If you make any class as final, you cannot extend it.
{
    void run()
    {
        System.out.println("running safely with 100kmph");
    }
}