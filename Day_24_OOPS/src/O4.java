public class O4 {
    public static void main(String[] args) {
        B obj = new B();
        obj.meth(); // method overriding


    }
}
class A
{
    int x = 10 ;
    // class may contain constructor variables and functions ;
    void meth()
    {
        System.out.println("HI "+x);
    }
}

class B
{
    int x = 20;
    void meth()
    {
        System.out.println("Hello "+x);

    }
}
