import java.util.Scanner;

public class O8_Menu_Driven_VariousGeometricShapes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 0 - for Rectangle");
        System.out.println("Enter 1 - for Square");
        System.out.println("Enter 2 - for Circle");
        System.out.println("Enter 3 - for Triangle");
        System.out.println("Enter 4 - for Parallelogram");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.nextInt();
        }
        int id = in.nextInt();
        if(id>4)
        {
            System.out.println("Not valid id");
            System.exit(0);
        }
        if(id == 0)
        {
            System.out.println("please enter the length");
            int l = in.nextInt();
            System.out.println("please enter the length");
            int b = in.nextInt();
            System.out.printf("Area of the triangle with len - %d & breadth %d is %d",l,b,l*b);
        }
        if(id==1)
        {
            System.out.println("enter the side of the square");
            int a = in.nextInt();
            System.out.printf("the area of the square is %d with side %d",a*a,a);

        }
        if(id==2)
        {
            System.out.println("Please enter the radius of the circle ");
            double r = in.nextDouble();
            System.out.printf("Area of the circle with radius %f is %f",r,3.14*r*r);
        }
        if(id==3)
        {
            System.out.println("Please enter the height");
            double h = in.nextDouble();
            System.out.println("Please enter the base");
            double b = in.nextDouble();
            System.out.printf("Area of the triangle is %f",0.5*h*b);
        }
        if(id==4)
        {
            System.out.println("enter the base length");
            double b = in.nextDouble();
            System.out.println("enter the height length ");
            double h = in.nextDouble();
            System.out.printf("Area of the parallelogram is %f",b*h);
        }




    }
}
// in case of if else which takes more computation time
// we can use the switch statements for more exact execution of the commands
// concatenation - meaning sum of all the elements or entities
// or linking of similar items