package StaticKeyword;

public class StaticMethod {
//Test class to create and display the values of object
public static void main(String args[]){
    //StudentNew.change();//calling change method
    //creating objects
    StudentNew s1 = new StudentNew(111,"Karan");

    StudentNew s2 = new StudentNew(222,"Aryan");
    StudentNew s3 = new StudentNew(333,"Sonoo");
    //calling display method
    s1.display();
    StudentNew.change(); // this is where the static method is called

    s2.display();
    s3.display();
}
}
class StudentNew{
    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable
    StudentNew(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
