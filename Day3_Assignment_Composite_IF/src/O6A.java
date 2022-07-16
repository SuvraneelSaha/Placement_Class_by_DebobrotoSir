import java.util.Scanner;

public class O6A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the 1st side ");
        int a = in.nextInt();
        System.out.println("enter the 2nd side ");
        int b = in.nextInt();
        System.out.println("enter the 3rd side ");
        int c = in.nextInt();

        System.out.println(TypeofTriangle(a,b,c));

    }
    static String TypeofTriangle(int a,int b,int c)
    {
        if(a==b && b==c)
        {
            return "Equilateral Triangle";
        }
        else if(a==b||b==c||c==a)
        {
            return "isosceles triangle";
        }
        else
        {
            return "Scalene Triangle";
        }
    }
}
