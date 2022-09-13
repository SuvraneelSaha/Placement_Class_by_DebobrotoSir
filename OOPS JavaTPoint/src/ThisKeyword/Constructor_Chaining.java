package ThisKeyword;
//Important - Call to this() must be the first statement in constructor.

public class Constructor_Chaining {
    public static void main(String args[]) {
        Student10 s1 = new Student10(111, "ankit", "java");
        Student10 s2 = new Student10(112, "sumit", "java", 6000f);
        s1.display();
        s2.display();
    }

    }
class Student10
{
    int rollno;
    String name,course;
    float fee;
    Student10(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student10(int rollno,String name,String course,float fee)
    {
        this(rollno,name,course); // this statement ie using the this.keyword linking with another Construcotor
        // or method should be the first line otherwise we will get compilation time error


        //reusing constructor
        // we are reuning the above constructor so that
        // we dont need to write the code again and again
        // and for the fee part we are explicitly storing the fee inside the this.fee ie the instance var
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}