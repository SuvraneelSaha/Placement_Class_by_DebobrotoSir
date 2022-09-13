package SuperKeyword;
/*
Another example of super keyword where super() is provided by the compiler implicitly.

As we know well that default constructor is
 provided by compiler automatically if there is no constructor.
  But, it also adds super() as the first statement.

  super() is added in each class constructor
  automatically by compiler if there is no super() or this().


 */
public class O5_Super_IsProvidedBytheCompiler_Implicitly {
    public static void main(String args[]) {
        Dog4 d = new Dog4();

    }
}
class Animal4{
    Animal4()
    {
        System.out.println("animal is created");
    }
}
class Dog4 extends Animal4
{
    Dog4()
    {
        System.out.println("dog is created");
    }
}