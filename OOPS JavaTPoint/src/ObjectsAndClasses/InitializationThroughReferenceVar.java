package ObjectsAndClasses;
class Student3{
    int id;
    String name;
}
public class InitializationThroughReferenceVar {
    public static void main(String[] args) {
        Student3 s1  = new Student3();
        s1.id = 101;
        s1.name = "Nigga";
        System.out.println(s1.id);
        System.out.println(s1.name);

    }
}
