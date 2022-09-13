package ThisKeyword;
/*
Important
The this keyword can be used to refer current class instance variable.
 If there is ambiguity between the instance variables and parameters,
  this keyword resolves the problem of ambiguity.

  In the above example,
   parameters (formal arguments) and instance variables are same.
    So, we are using this keyword to distinguish local variable and instance variable.
 */
public class WithoutUsingThisKeyword {
    public static void main(String args[]) {
        Student s1 = new Student(111, "ankit", 5000f);
        Student s2 = new Student(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}
class Student{
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee){
        rollno=rollno; // we are passing the argument which is of the instance variable and we are storing it
        // inside the Instance variable only
        // which means that no values have been changed
        // and the default value of the instance variable remain the same
        // so for int - 0
        // for String - Null
        // for float - 0.0 default values
        name=name;
        fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}
