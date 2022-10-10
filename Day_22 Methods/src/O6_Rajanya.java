import java.util.*;
public class O6_Rajanya
{
    public static void rajanya(int a)
    {
        int f=0;
        for(int i=2;i<=a/2;i++)
            if(a%i==0)
                f=1;

        if(f==1)
            System.out.println("not prime");
        else
            System.out.println("prime");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Enter third number:");
        int c=sc.nextInt();
        rajanya(a);
        rajanya(b);
        rajanya(c);
    }
}
