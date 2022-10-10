import java.util.Scanner;

public class O7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Enter third number:");
        int c=sc.nextInt();

        if(rajanya(a)==1 && rajanya(b)==1 && rajanya(c)==1)
        {
            System.out.println("all are prime");
        }
        else
        {
            System.out.println("Not all are prime");
        }

    }
    public static int rajanya(int a)
    {
        // bhalo chele theorem
        // we can do it using boolean also the function
        int f=1;
        for(int i=2;i<=a/2;i++)
            if(a%i==0)
                f=0;

       return f;
    }
}
