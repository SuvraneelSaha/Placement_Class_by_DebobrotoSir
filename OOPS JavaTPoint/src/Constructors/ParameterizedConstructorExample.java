package Constructors;
/*
when we are using a parameterized constructor then we have to define it
like we usually do
we can create a method inside the class to display the values

but when we are using two constructors one is parameterized and non parameterized
then we need to decalare  the default constructor explicitly otherwise the java will get confused on which
constructor to invoke

 */
public class ParameterizedConstructorExample {
    public static void main(String args[]) {
        //creating objects and passing values
        Student6 s1 = new Student6();
        s1.id = 44;
        s1.name="Wigga";
        Student6 s2 = new Student6();
        s2.id = 55;
        s2.name = "Nigga";
        //calling method to display the values of object
        s1.display();
        s2.display();

    }
}
class Student6 {
    int id;
    String name;


    //method to display the values
    void display()
    {
        System.out.println(id + " " + name);
    }

}

