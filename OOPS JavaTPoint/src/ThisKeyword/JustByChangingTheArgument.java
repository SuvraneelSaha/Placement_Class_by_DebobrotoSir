package ThisKeyword;

public class JustByChangingTheArgument {
    public static void main(String args[]) {
        Student2 s1 = new Student2(111, "ankit", 5000f);
        Student2 s2 = new Student2(112, "sumit", 6000f);
        s1.display();
        s2.display();

    }
}
class Student2{
    int rollno;
    String name;
    float fee;
    // here what we are doing is that we are just changing the arguments which are being refferred to
    // when we are using a constructor to initialize the object
    Student2(int r,String n,float f){
        rollno=r;
        name=n;
        fee=f;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

