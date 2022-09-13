package StaticKeyword;

public class ExampleOfStaticVariable {
    public static void main(String args[])
    {
        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(222,"Aryan");
        //we can change the college of all objects by the single line of code
        //Student.college="BBDIT";
        s1.display();
        s2.display();
    }

}
class Student
{
    int rollno;//instance variable
    String name;
    static String college ="UEM";//static variable
    // static variables cannot be changed
    // whereas the instance variables which are inside the class but outside the method is known as
    // instance variables
    //constructor
    Student(int r, String n)
    {
        rollno = r;
        name = n;
    }
    //method to display the values
    void display ()
    {
        System.out.println(rollno+" "+name+" "+college);
    }
}
