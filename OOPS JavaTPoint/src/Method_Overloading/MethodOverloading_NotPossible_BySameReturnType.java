package Method_Overloading;


//  In java, method overloading is not possible by
//  changing the return type of the method only because of ambiguity.

//ompile Time Error is better than Run Time Error.
// So, java compiler renders compiler time error
// if you declare the same method having same parameters.
public class MethodOverloading_NotPossible_BySameReturnType {
    public static void main(String[] args) {
        System.out.println(Adder2.add(11,11));//ambiguity

    }
}
class Adder2
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(float a,float b) // but if both the parameters and the return type is the same then java ill give
            // compilation errors
    {
        return a+b;
    }
}