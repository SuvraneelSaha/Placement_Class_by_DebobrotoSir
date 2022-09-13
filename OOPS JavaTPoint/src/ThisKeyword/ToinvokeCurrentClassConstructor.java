package ThisKeyword;

public class ToinvokeCurrentClassConstructor {
    public static void main(String args[]) {
        A1 a = new A1(10);
    }
    }
class A1{
    A1()
    {
        System.out.println("hello a");
    }
    A1(int x)
    {
        this(); // we are calling the Default constructor from a parameterized Constructor
        System.out.println(x);
         //this();
        // we cannot do this due to the java compiler issues
        // compilation error
        // Error : call to this must be first statement in constructor

    }
}
