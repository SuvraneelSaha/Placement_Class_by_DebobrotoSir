package FinalKeyword;

public class O2_Final_Method {
    public static void main(String args[]) {
        Honda honda = new Honda();
        //honda.run();
        // will give ct error
    }
}

class Bike{
    final void run(){System.out.println("running");} // If you make any method as final, you cannot override it.
}

class Honda extends Bike {
   // void run()
    {
        System.out.println("running safely with 100kmph"); // If you make any method as final, you cannot override it.
    }
}