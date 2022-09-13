package Inheritance;

/*
Why multiple inheritance is not supported in java?
To reduce the complexity and simplify the language,
 multiple inheritance is not supported in java.

 Consider a scenario where A, B, and C are three classes.
  The C class inherits A and B classes.
   If A and B classes have the same method and you call it
    from child class object,
     there will be ambiguity to call which one of the  method of A or B class.

     Since compile-time errors are better than runtime errors,
     Java renders compile-time error if you inherit 2 classes. -- important whenever you try to inherited
     more than 1 class it will give compilation error
      So whether you have same method or different, there will be compile time error.


 */

public class Multiple_Inheritance_NotSupportedExample
{
    public static void main(String args[])
    {
        C obj = new C();
        obj.msg();//Now which msg() method would be invoked?
    }
}


class A{
    void msg(){System.out.println("Hello");}
}
class B{
    void msg(){System.out.println("Welcome");}
}
class C extends A  // ,b not allowed

{

}
