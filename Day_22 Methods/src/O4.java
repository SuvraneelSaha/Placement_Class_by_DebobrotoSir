import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the 1st number");
        int a1 = in.nextInt();
        int f1 = Factorial(a1);
        System.out.println("Please enter the 2nd number");
        int a2 = in.nextInt();
        int f2 = Factorial(a2);
        System.out.println("Please enter the 3rd number");
        int a3 = in.nextInt();
        int f3 = Factorial(a3);
        System.out.println(f1+f2+f3);

    }
    public static int Factorial(int a)
    {
        int fact1 = 1 ;
        for (int i = 1; i <=a ; i++)
        {
            fact1 = fact1 * i;
        }
        return fact1;
    }
}
