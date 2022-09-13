package Constructors;
//Java program to initialize the values from one object to another object.
public class CopyConstructor {
    public static void main(String args[])
    {
        Student8 s1 = new Student8(111,"Karan");
        Student8 s2 = new Student8(s1);
        s1.display();
        s2.display();
    }
}
class Student8 {
    int id;
    String name;

    //constructor to initialize integer and string
    Student8(int i, String n)
    {
        id = i;
        name = n;
    }

    //constructor to initialize another object
    // copy constructor
    Student8(Student8 s1)
    {
        this.id = s1.id;
        this.name = s1.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

