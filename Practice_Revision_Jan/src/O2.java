import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the two sides of a rectangle ");
        int a = in.nextInt();
        int b = in.nextInt();

        area(a,b);
        System.out.println();
        Perimeter(a,b);

        System.out.println("Please enter the radius of a circle");
        int radius = in.nextInt();
        area(radius);
        System.out.println();
        Perimeter(radius);


    }
    public static void area(int a, int b)
    {
        System.out.printf("the area with sides %d and %d is %d",a,b,a*b);
    }
    public static void Perimeter(int a,int b)
    {
        int p = 2*(a+b);
        System.out.printf("the perimeter with sides %d and %d is %d",a,b,p);
    }
    public static void Perimeter(int a)
    {
        float arr = (float) (2*3.14*a);
        System.out.println("the area of the circle is "+arr);
    }
    public static void area(int a)
    {
        double area = 3.14*a*a;
        System.out.println("the area of the circle is "+area);
    }
}
