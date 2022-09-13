package SuperKeyword;

public class O3_Super_ParentClassMethod {
    public static void main(String args[]) {
        Dog1 d = new Dog1();
        d.eat();
    }
}
class Animal1
{
    void eat(){System.out.println("Still eating...");}
}
class Dog1 extends Animal1{
    void eat()
    {
        System.out.println("eating bread...");
        super.eat();
    }

}