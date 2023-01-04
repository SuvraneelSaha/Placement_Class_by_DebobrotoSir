import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();

        addition(a,b);
        System.out.println();
        substraction(a,b);
        System.out.println();
        multiplication(a,b);
        System.out.println();
        division(a,b);
        System.out.println();
        remainder(a,b);



    }
    public static void addition(int a,int b)
    {
        System.out.printf("the addition of %d and %d is %d",a,b,a+b);

    }
    public static void substraction(int a,int b)
    {
        if(a>b)
        {
            System.out.printf("the substraction between %d and %d is %d",a,b,a-b);
        }
        else
        {
            System.out.printf("the substraction between %d and %d is %d",b,a,b-a);
        }
    }
    public static void multiplication(int a,int b)
    {
        System.out.printf("the multiplication between %d and %d is %d",a,b,a*b);
    }
    public static void division(int a,int b)
    {
        if(a>b)
        {
            System.out.printf("the division between %d and %d is %d",a,b,a/b);

        }
        else
        {
            System.out.printf("the division between %d and %d is %d",b,a,b/a);
        }
    }
    public static void remainder(int a,int b)
    {
        if(a>b)
        {
            System.out.printf("the remainder between %d and %d is %d",a,b,a%b);
        }
        else
        {
            System.out.printf("the remainder between %d and %d is %d",b,a,b%a);

        }
    }
}
