package Method_Overloading;
// Example of Method Overloading with Type Promotion in case of ambiguity

// One type is not de-promoted implicitly for example double cannot be depromoted to any type implicitly.

public class MethodOverloading_TypePromotionAmbiguity {
    public static void main(String args[]) {
        OverloadingCalculation3 obj = new OverloadingCalculation3();
        //obj.sum(20, 20);//now ambiguity
        // Error -- compilation Error

    }
}

class OverloadingCalculation3 {
    void sum(int a, long b) {
        System.out.println("a method invoked");
    }

    void sum(long a, int b) {
        System.out.println("b method invoked");
    }
}