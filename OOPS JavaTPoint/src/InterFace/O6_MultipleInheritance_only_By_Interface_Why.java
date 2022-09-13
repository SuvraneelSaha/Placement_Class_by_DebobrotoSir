package InterFace;

public class O6_MultipleInheritance_only_By_Interface_Why
{
    /*
    As we have explained in the inheritance chapter,
     multiple inheritance is not supported in the case of class because of ambiguity.
      However, it is supported in case of an interface because there is no ambiguity.
       It is because its implementation is provided by the implementation class. For example:
     */
    public static void main(String args[])
    {
        TestInterface3 obj = new TestInterface3();
        obj.print();
    }
    /*
    As you can see in the above example,
     Printable1 and Showable1 interface have same methods
      but its implementation is provided by class TestTnterface1,
       so there is no ambiguity.
     */

}
interface Printable1{
    void print();
}
interface Showable1{
    void print();
}
class TestInterface3 implements Printable1, Showable1
{
    public void print()
    {
        System.out.println("Hello");
    }
}