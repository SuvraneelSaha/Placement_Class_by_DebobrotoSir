package Constructors;
//Java program to overload constructors
public class ConstructorOverloading {
    public static void main(String args[])
    {
        Student7 s1 = new Student7(111,"Karan");
        Student7 s2 = new Student7(222,"Aryan",25);
        Student7 s3 = new Student7();
        s3.id = 101;
        s3.name="Migga";
        s3.age = 22;
        s1.display();
        s2.display();
        s3.display();
    }

}
class Student7 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Student7(int i, String n)
    {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Student7(int i, String n, int a)
    {
        this.id = i;
        this.name = n;
        this.age = a;
    }
    Student7()
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println(id + " " + name + " " + age);
    }
}
