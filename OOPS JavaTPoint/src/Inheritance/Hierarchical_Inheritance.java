package Inheritance;
// Hierarchical
// where there would be a main Parent class
// and there would be two or more than two child class
// in which both the classes will be totally different to each other but will have
// inherit the Parent Class Properties
public class Hierarchical_Inheritance {
    public static void main(String args[])
    {
        Cat c = new Cat();
        c.meow();
        c.eat();
        Dog2 d = new Dog2();
        d.eat();
        d.bark();
      //  d.meow(); // compilation time error
        // as meow function or method is present in the Cat Class and it doesnt extends the Dog2 Class
        //c.bark();//C.T.Error
    }

}
class Animal2
{
    void eat(){System.out.println("eating...");}
}
class Dog2 extends Animal2
{
    void bark(){System.out.println("barking...");}
}

class Cat extends Animal2
{
    void meow(){System.out.println("meowing...");}
}
