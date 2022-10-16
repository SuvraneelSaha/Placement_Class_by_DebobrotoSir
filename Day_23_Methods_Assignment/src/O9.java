import java.util.Scanner;

public class O9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1");
        float x1 = in.nextFloat();
        System.out.println("Enter y1");
        float y1 = in.nextFloat();
        System.out.println("Enter x2");
        float x2 = in.nextFloat();
        System.out.println("Enter y2");
        float y2 = in.nextFloat();
        System.out.println("Enter x3");
        float x3 = in.nextFloat();
        System.out.println("Enter y3");
        float y3 = in.nextFloat();

        float sideA = Sqrt(Sum(Square(Difference(x2,x1)) , Square(Difference(y2,y1))));

        float sideB = Sqrt(Sum(Square(Difference(x3,x2)) , Square(Difference(y3,y2))));

        float sideC = Sqrt(Sum(Square(Difference(x3,x1)) , Square(Difference(y3,y1))));

        System.out.println("Is Triangle "+isTriangle(sideA,sideB,sideC));

        System.out.println("SideA = "+sideA);
        System.out.println("SideB = "+sideB);
        System.out.println("SideC = "+sideC);

        TypeOfTriangle(sideA,sideB,sideC);


    }
    public static void TypeOfTriangle(float a, float b , float c)
    {
        if(a==b && b==c && c==a)
        {
            System.out.println("Equilateral triangle");
        }
        else if(a==b || b==c || c==a)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }

    }
    public static Boolean isTriangle(float a,float b , float c)
    {
        if(a+b>c)
        {
            return true;
        }
        else if(b+c>a)
        {
            return true;
        }
        else if(c+a>b)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static float Difference(float a , float b)
    {
        float diff = 0 ;

        diff = a-b;
        return diff;
    }
    public static float Square(float diff)
    {
        return diff*diff;

    }

    public static float Sum(float a ,float b)
    {
        return a+b;
    }

    public static float Sqrt(float n)
    {
        return (float) Math.sqrt(n);
    }

}
