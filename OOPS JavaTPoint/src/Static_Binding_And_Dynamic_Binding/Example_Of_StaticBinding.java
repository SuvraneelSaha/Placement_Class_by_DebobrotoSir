package Static_Binding_And_Dynamic_Binding;

public class Example_Of_StaticBinding {
    public static void main(String args[]){
        Dog d1=new Dog();
        d1.eat();
    }
}
class Dog{
   final void eat(){System.out.println("dog is eating...");}
    // when the Method type was of private we cant use that method outside of that class
    // whereas when we use final method we can use it outside of the class
    // but method overriding cannot take place
    // and when we use static keyword - static methods can be used without the need of creating
    // a new object of that class
    // a static method can access static data member can change the value of it
    // a static method belongs to the class rather than the object of that class



}