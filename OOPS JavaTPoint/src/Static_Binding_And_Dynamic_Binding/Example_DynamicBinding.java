package Static_Binding_And_Dynamic_Binding;

public class Example_DynamicBinding {
    /*
    When type of the object is determined at run-time, it is known as dynamic binding.

     */
/*
In the above example object type cannot be determined by the compiler,
 because the instance of Dog is also an instance of Animal.
 So compiler doesn't know its type, only its base type.
 */
    public static void main(String args[]){
        Animal1 a=new Dog1();//  upcasting type of polymorphism runtime polymorphism
        a.eat();
    }
}
class Animal1{
    void eat(){System.out.println("animal is eating...");}
}

class Dog1 extends Animal1 {
    void eat() {
        System.out.println("dog is eating...");
    }
}