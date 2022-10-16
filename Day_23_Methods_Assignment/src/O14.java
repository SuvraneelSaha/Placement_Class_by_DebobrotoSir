import java.util.Scanner;

public class O14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st number:");
        int a = in.nextInt();
        System.out.println("Please enter the 2nd number:");
        int b = in.nextInt();

        int lcm = (a*b)/Hcf(a,b);

        System.out.printf("HCF of %d and %d is %d",a,b,Hcf(a,b));

        System.out.printf("Lcm of %d and %d is %d",a,b,lcm);

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
