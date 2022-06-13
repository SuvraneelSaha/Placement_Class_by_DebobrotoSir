import java.util.Scanner;

public class O7_TypeofTriangleAngle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st angle");
        int a =in.nextInt();
        System.out.println("please enter the 2nd angle");
        int b = in.nextInt();
        System.out.println("please enter the 3rd angle");
        int c = in.nextInt();

        if(a<=60)
        {
            if(b<=60)
            {
                if(c<=60)
                {
                    if(a+b+c==180)
                    {
                        System.out.printf("%d %d %d acute angled triangle ",a,b,c);
                    }
                }
            }
        }
        // for right angled triangle
        else if(a==90)
        {
            if(b+c==90)
            {
                System.out.printf("%d %d %d Right angled triangle ",a,b,c);
            }

        }
        else if(b==90)
        {
            if(a+c==90)
            {
                System.out.printf("%d %d %d Right angled triangle ",a,b,c);
            }

        }
        else if(c==90)
        {
            if(a+b==90)
            {
                System.out.printf("%d %d %d Right angled triangle ",a,b,c);
            }

        }

        // for the obtuse angled triangle
        else if(a>=90)
        {
            if(a+(b+c)==180)
            {
                System.out.printf("Obtuse angled triangle %d %d %d",a,b,c);
            }
        }
        else if(b>=90)
        {
            if(a+b+c==180)
            {
                System.out.printf("Obtuse angled triangle %d %d %d",a,b,c);
            }
        }
        else if(c>=90)
        {
            if(a+b+c==180)
            {
                System.out.printf("Obtuse angled triangle %d %d %d",a,b,c);
            }
        }
        else
        {
            System.out.println("Not valid triangle");
        }
        System.out.println("Not valid Triangle");
    }
}
// ex - a - 120
// b - 40
// c - 20
// always check the condition if the traingle a+b+c == 180 or not 
