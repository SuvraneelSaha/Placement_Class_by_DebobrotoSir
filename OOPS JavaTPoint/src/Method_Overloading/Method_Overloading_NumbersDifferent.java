package Method_Overloading;
//Method Overloading: changing no. of arguments
public class Method_Overloading_NumbersDifferent {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));
        // method overloading

    }
}
class Adder{
    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        return a+b+c;
    }
}