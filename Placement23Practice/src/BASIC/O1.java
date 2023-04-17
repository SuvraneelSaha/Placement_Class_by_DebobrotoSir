package BASIC;

import java.util.Scanner;

// Enter 2 numbers and find the result of addition , substraction , multiplication , division
public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 2 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Addition "+add(a,b));
        System.out.println("Substraction "+substraction(a,b));
        System.out.println("Multiplication "+multiplication(a,b));
        System.out.println("Division "+division(a,b));

    }
    public static int add(int a , int b)
    {
        return  a+b;
    }
    public static int substraction(int a , int b)
    {
        if(a>b)
        {
            return a-b;
        }
        else
            return b-a;
    }
    public static int multiplication(int a , int b)
    {
        return a*b;
    }
    public static float division(int a , int b)
    {
        if(a>b)
        {
            return (float) a/b;
        }
        else
            return (float) b/a;
    }
}
