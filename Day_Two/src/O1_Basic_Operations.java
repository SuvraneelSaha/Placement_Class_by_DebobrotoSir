import java.util.Scanner;

public class O1_Basic_Operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 2 nums ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();
        int b = in.nextInt();
        sum(a,b);
        System.out.println();
        minus(a,b);
        System.out.println();
        mul(a,b);
        System.out.println();
        div(a,b);


    }
    static void sum(int a , int b)
    {
        int c = a+b;
        System.out.printf("the sum of %d and %d is %d",a,b,c);
    }
    static void minus(int a,int b)
    {
        int c=0;
        if(a>b)
        {
            c = a-b;
        }
        else if(a==b)
        {
            c = 0 ;
        }
        else
        {
            c = b-a;
        }
        System.out.printf("the minus result of %d and %d is %d",a,b,c);
    }
    static void mul(int a , int b)
    {
        int c = a*b;
        System.out.printf("the multiplication result is %d ",c);

    }
    static void div(int a,int b)
    {
        int c =0;
        if(a>b)
        {
            c = a/b;
        }
        else if(a==b)
        {
            c=1;
        }
        else
        {
            c = b/a;
        }
        System.out.printf("the division of %d and %d is %d",a,b,c);

    }
}
// add , sum , multiplication and division
