package Method_Overloading;
///Method Overloading with Type Promotion if matching found
public class MethodOverloading_MatchingVariables {
    public static void main(String[] args) {


        OverloadingCalculation2 obj = new OverloadingCalculation2();
        obj.sum(20, 20);//now int arg sum() method gets invoked

        // If there are matching type arguments in the method, type promotion is not performed.
    }

}
class OverloadingCalculation2 {
    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum(long a, long b) {
        System.out.println("long arg method invoked");
    }
}
