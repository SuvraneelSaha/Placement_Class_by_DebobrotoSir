package ThisKeyword;

public class Calling_Para_Constructor_From_Default_Constructor {
    public static void main(String args[]) {
        A2 a = new A2();

       // new A2(10);

    }
}
class A2
{
    A2()
    {
        this(5);
        System.out.println("hello a");
    }
    A2(int x)
    {
        System.out.println(x);
    }
}