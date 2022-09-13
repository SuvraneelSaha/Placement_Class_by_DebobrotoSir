package FinalKeyword;

public class StaticBlankFinalVariable {
    /*
    A static final variable that is not initialized
    at the time of declaration is known as static blank final variable.
    It can be initialized only in static block.
     */
    public static void main(String args[]){
        System.out.println(A.data);
    }

}
    class A {
        static final int data;//static blank final variable

        static
        {
            data = 50; //A static final variable that is not initialized at the time of declaration is known as
            // the blank final variable
            // It can be initialized only in static block.
        }
    }