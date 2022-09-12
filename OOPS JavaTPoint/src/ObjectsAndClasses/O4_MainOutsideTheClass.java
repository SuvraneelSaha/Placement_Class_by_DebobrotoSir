package ObjectsAndClasses;
class Student1 {
    int id;
    String name;

}
public class O4_MainOutsideTheClass {
    public static void main(String[] args)
    {
        Student1 s1 = new Student1();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }

}
