package InstanceOf_And_DownCasting;

/*
An object of subclass type is also a type of parent class.
For example, if Dog extends Animal then object of Dog can be referred by either Dog or Animal class.
 */
public class Example_InstanceOF {
    public static void main(String args[]){
        Dog1 d=new Dog1();
        System.out.println(d instanceof Animal);//true
    }
}
class Animal{}
class Dog1 extends Animal {//Dog inherits Animal
}