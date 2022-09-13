package FinalKeyword;

public class O2_FinalMethod_Experiment {
    public static void main(String args[]) {
        Honda1 honda = new Honda1();
        honda.run();

      //  If you make any method as final, you cannot override it.
    }
}
class Bike1{
    void run(){System.out.println("running");} // If you make any method as final, you cannot override it.
}

class Honda1 extends Bike1 {
     void run()
    {
        super.run();
        System.out.println("running safely with 100kmph"); // If you make any method as final, you cannot override it.
        super.run(); // it is possible in case of Methods but in case of Constructor it is not Possible

    }
}