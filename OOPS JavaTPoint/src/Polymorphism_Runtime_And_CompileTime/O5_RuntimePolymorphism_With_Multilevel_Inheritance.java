package Polymorphism_Runtime_And_CompileTime;

public class O5_RuntimePolymorphism_With_Multilevel_Inheritance {
    public static void main(String args[]){
        Animal a1,a2,a3;
        a1=new Animal();
        a2=new Dog();
        a3=new BabyDog();
        a1.eat();
        a2.eat();
        a3.eat();
    }

}
class Animal{
    void eat(){System.out.println("Animal");}
}
class Dog extends Animal{
    void eat(){System.out.println("Dog");}
}
class BabyDog extends Dog {
    void eat() {
        System.out.println("BabyDog");
    }
}