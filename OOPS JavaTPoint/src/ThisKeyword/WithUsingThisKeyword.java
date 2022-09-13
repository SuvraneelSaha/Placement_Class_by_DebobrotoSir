package ThisKeyword;

public class WithUsingThisKeyword {
    public static void main(String args[]) {
        Student1 s1 = new Student1(111, "ankit", 5000f);
        Student1 s2 = new Student1(112, "sumit", 6000f);
        s1.display();
        s2.display();

    }
}
class Student1
{
    int rollno;
    String name;
    float fee;
    // this the the constructore which helps to initialize the Object or instance of a class

    Student1(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}
