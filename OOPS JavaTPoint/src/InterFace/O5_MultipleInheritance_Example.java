package InterFace;

public class O5_MultipleInheritance_Example {
    public static void main(String args[]){
        A7 obj = new A7();
        obj.print();
        obj.show();
    }

}
interface Printable{
    void print();
}
interface Showable
{
    void show();
}
class A7 implements Printable,Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }
}
