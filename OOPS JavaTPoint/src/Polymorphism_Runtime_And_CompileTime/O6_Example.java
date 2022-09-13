package Polymorphism_Runtime_And_CompileTime;

public class O6_Example {
    public static void main(String args[]) {
        Animal4 a = new BabyDog1();
        a.eat();
        /*
        Since, BabyDog is not overriding the eat() method, so eat() method of Dog class is invoked.
         */
    }
}
class Animal4{
    void eat(){System.out.println("animal is eating...");} // this method has been overridden by the
    // eat method which is present in the subclass

}
class Dog4 extends Animal4{
    void eat(){System.out.println("dog is eating...");}
}
class BabyDog1 extends Dog4
{
}