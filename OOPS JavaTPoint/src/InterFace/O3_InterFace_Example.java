package InterFace;

public class O3_InterFace_Example {
    public static void main(String args[]){
        A6 obj = new A6();
        obj.print();
    }

}
interface printable
{
    void print();
}
class A6 implements printable
{
    public void print()
    {
        System.out.println("Hello");
    }
}