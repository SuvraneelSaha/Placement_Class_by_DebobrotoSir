import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        square obj1 = new square();
        rectangle obj2 = new rectangle();
        triangle obj3 = new triangle();
        circle obj4 = new circle();
        shape ob = new square();


        System.out.println("Enter 1 for square");
        System.out.println("Enter 2 for rectangle");
        System.out.println("Enter 3 for triangle ");
        System.out.println("Enter 4 for circle ");
        int ch1 =in.nextInt();
        System.out.println("Enter 1 for square ");
        System.out.println("Enter 2 for perimeter ");
        System.out.println("Enter 3 for details ");
        System.out.println("Enter 4 for diagonals ");
        System.out.println("Enter 5 for diameters ");
        int ch2 = in.nextInt();
        switch (ch1)
        {
            case 1:
                ob = obj1;
                // runtime decision which object will be used
                // this is known as dynamic binding
                // this object will be known at runtime which object will be used

                break;
            case 2:
                ob = obj2;
                break;
            case 3 :
                ob = obj3;
                break;
            case 4:
                ob = obj4;
                break;

        }

        switch (ch2)
        {
            case 1:
                ob.area();
                break;
            case 2:
                ob.perimeter();
                break;
            case 3 :
                ob.details();
                break;
            case 4:
                ob.diagonal();
                break;
            case 5:
                ob.diameter();
                break;
        }

    }
}

// abstract class is not concrete
//
abstract class shape
{
    abstract void area();
    // this will be automatically defined according to that of the object
    abstract void perimeter();
    abstract void details();

    void diagonal()
    {
        System.out.println("does not exists");
    }
    void diameter()
    {
        System.out.println("Does not exists");
    }
}

class rectangle extends shape
{
    void area()
    {
        System.out.println("Rectangle Area");
    }
    void perimeter()
    {
        System.out.println("Rectangle Perimeter");
    }
    void details()
    {
        System.out.println("Rectangle details");
    }

}

/*
1 -
2 - rectangle
3 -
4 -


 */
class square extends shape
{
    void area()
    {
        System.out.println("Rectangle Area");
    }
    void perimeter()
    {
        System.out.println("Rectangle Perimeter");
    }
    void details()
    {
        System.out.println("Rectangle details");
    }
}
class triangle extends shape
{
    void area()
    {
        System.out.println("Rectangle Area");
    }
    void perimeter()
    {
        System.out.println("Rectangle Perimeter");
    }
    void details()
    {
        System.out.println("Triangle details");
    }

}
class circle extends shape
{
    void area() {
        System.out.println("Rectangle Area");
    }

    void perimeter() {
        System.out.println("Rectangle Perimeter");
    }

    void details()
    {
        System.out.println("Rectangle details");
    }
    void diagonal()
    {
        System.out.println("Circle Diagonal");
    }

}



