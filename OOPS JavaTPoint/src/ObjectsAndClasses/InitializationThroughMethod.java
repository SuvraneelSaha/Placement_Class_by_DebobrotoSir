package ObjectsAndClasses;
class Student2{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        this.rollno=r;
        this.name=n;
        // this keyword as per the naming convention will know about it later
    }
    void displayInformation()
    {
        System.out.println(rollno+" "+name);
    }
}
public class InitializationThroughMethod {
    public static void main(String[] args) {
        Student2 s1=new Student2();
        Student2 s2=new Student2();
        s1.insertRecord(111,"Karthik");
        s2.insertRecord(222,"Aryan");
        s1.displayInformation();
        s2.displayInformation();

    }
}
