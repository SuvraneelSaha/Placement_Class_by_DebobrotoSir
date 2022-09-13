package SuperKeyword;
// super is used to refer immediate parent class instance variable.

public class Super_InstanceVariable {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.printColor();
    }

}
class Animal
{
    String color="white";
}
class Dog extends Animal
{
    String color="black";
    void printColor()
    {
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}