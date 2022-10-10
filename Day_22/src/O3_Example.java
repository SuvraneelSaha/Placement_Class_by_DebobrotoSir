import java.util.Scanner;

public class O3_Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the 1st number");
        int a1 = in.nextInt();
        Factorial(a1);
        System.out.println("Please enter the 2nd number");
        int a2 = in.nextInt();
        Factorial(a2);
        System.out.println("Please enter the 3rd number");
        int a3 = in.nextInt();
        Factorial(a3);

    // planet hocche function ta
        // aar aamra manush pathacchi function e mane onno planet e kaaj korar jonno

    }
    public static void Factorial(int a)
    {
        int fact1 = 1 ;
        for (int i = 1; i <=a ; i++)
        {
            fact1 = fact1 * i;
        }
        System.out.printf("Factorial of the %d  is %d ",a,fact1);
    }
}
