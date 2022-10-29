public class O5 {
    public static void main(String[] args) {

        B1 obj = new B1(); // this is the constructor
        // the super class constructor will be called first
        //
        System.out.println();

        System.out.println(obj.x);
        obj.meth();

        //System.out.println(super.obj.x);
        // Main class er super ke java find kore but find kora jaay naa


    }
}
class A1
{
    // this is the super class
    // this is the class where everyone wants to have
    // or parent class or base class


    A1()
    {
        System.out.println("Inside A1 Class");
    }

    int x = 10 ;
    void meth()
    {
        System.out.println("hi"+x);
    }

}
class B1 extends A1
{
    // sub class , child class or derived class
    // all are the same

    B1()
    {
        System.out.println("Inside Def Class");
    }


    int x = 20;
    void meth()
    {
        super.meth();
        System.out.println("hello "+super.x);
        // super keyword means that we are using the Super Class
        // and adding a dot after super meaning we are using the attributes of the super class
        // and without any dot means constructor


    }




}
