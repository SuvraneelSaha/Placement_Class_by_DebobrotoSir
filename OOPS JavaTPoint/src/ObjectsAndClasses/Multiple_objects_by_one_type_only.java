package ObjectsAndClasses;
class Rectangle1{
    int length;
    int width;
    void insert(int l,int w){
        length=l;
        width=w;
    }
    void calculateArea()
    {
        System.out.println(length*width);
    }
}
public class Multiple_objects_by_one_type_only {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(),r2=new Rectangle();//creating two objects  at the same time
        // just as we do in the case of primitive data types
        // ex int a=10,b=20;
        r1.insert(11,5);
        r2.insert(3,15);
        r1.calculateArea();
        r2.calculateArea();

    }
}
