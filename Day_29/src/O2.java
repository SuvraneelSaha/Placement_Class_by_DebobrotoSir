import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Square obj1 = new Square();
        Rectangle obj2 = new Rectangle();
        Triangle obj3 = new Triangle();
        Circle obj4 = new Circle();

        // Solution - A general object class
        Square ob = new Square();
        // this is dynamic method dispatch or dynamic Binding
        // we need to use inheritance for class overriding
        // as there was no relation , there was errors
        // so by extending
        // dmd , abstract class and interface are the 3 brothers


        // choice on the person
        System.out.println("Enter 1 for square");
        System.out.println("Enter 2 for rectangle");
        System.out.println("Enter 3 for triangle ");
        System.out.println("Enter 4 for circle ");
        int ch1 =in.nextInt();

        // choice on the activity
        // what type of activity you want to do

        System.out.println("Enter 1 for square ");
        System.out.println("Enter 2 for perimeter ");
        System.out.println("Enter 3 for details ");
        int ch2 = in.nextInt();


//        switch (ch1)
//        {
//            case 1:
//            {
//                switch (ch2)
//                {
//                    case 1:obj1.area();
//                    break;
//                    case 2:obj1.perimeter();
//                    break;
//                    case 3 :obj1.details();
//                    break;
//                }
//            }
//            break;
//            case 2:
//            {
//                switch (ch2)
//                {
//                    case 1:obj2.area();
//                        break;
//                    case 2:obj2.perimeter();
//                        break;
//                    case 3 :obj2.details();
//                        break;
//                }
//            }
//            break;
//        }
        // The solution would be only once

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
        }

    }
}

class Rectangle extends Square
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
class Square
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
class Triangle extends Square
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
class Circle extends Square
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