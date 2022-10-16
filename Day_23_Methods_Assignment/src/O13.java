import java.util.Scanner;

public class O13 {
    public static void main(String[] args) {
        // hcf of two numbers
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st number:");
        int a = in.nextInt();
        System.out.println("please enter the 2nd number:");
        int b = in.nextInt();

        System.out.printf("the HCF of %d and %d is %d",a,b,Hcf(a,b));


    }
    public static int Hcf(int a,int b)
    {
        int small = a<b?a:b;

        int hcf = 0 ;

        for (int i = 1; i < small; i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf = i;

            }
        }
        return hcf;
    }
}
