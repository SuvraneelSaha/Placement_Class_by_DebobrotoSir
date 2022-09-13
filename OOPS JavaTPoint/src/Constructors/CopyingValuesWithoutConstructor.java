package Constructors;

public class CopyingValuesWithoutConstructor {
    public static void main(String args[]){
        Student10 s1 = new Student10(111,"Karan");
        Student10 s2 = new Student10(); // explicitly making a default constructor
        s2.id=s1.id;
        s2.name=s1.name;
        s1.display();
        s2.display();
    }

}
class Student10{
    int id;
    String name;
    Student10(int i,String n)
    {
        id = i;
        name = n;
    }
    Student10()
    {

    }
    void display(){System.out.println(id+" "+name);}

}