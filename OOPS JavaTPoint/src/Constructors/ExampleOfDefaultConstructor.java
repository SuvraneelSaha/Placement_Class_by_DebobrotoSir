package Constructors;
// Example of default constructor that displays the default values
// The default constructor is used to provide the default values to the object like 0, null, etc.,
// depending on the type.
/*
In the above class,you are not creating any constructor so compiler
 provides you a default constructor.
  Here 0 and null values are provided by default constructor.

  We havent even used a single constructor
 */

public class ExampleOfDefaultConstructor {
    public static void main(String args[]){
//creating objects
        Student3 s1=new Student3();
        Student3 s2=new Student3();
//displaying values of the object
        s1.id = 505;
        s1.name="Nigga";
        // im explicitly initializing the value of the s1 object with the name and the id
        s1.display();
        s2.display();
    }
}
class Student3 {
    int id;
    String name;

    //method to display the value of id and name
    void display()
    {
        System.out.println(id + " " + name);
    }
}


