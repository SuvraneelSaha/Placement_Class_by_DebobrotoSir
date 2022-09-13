package SuperKeyword;
/*
Important - call to super must be first statement in constructor only in the case of
Constructor

 */
public class O4_Super_ParentClassConstructor {
    public static void main(String args[]) {
        Dog2 d = new Dog2();
    }
}

class Animal2
{
    Animal2() // non parameterized Constructor
    {
        System.out.println("animal is created");
    }
}
class Dog2 extends Animal2
{
    Dog2()
    {
        super();
        System.out.println("That animal is a dog ");

    }
}