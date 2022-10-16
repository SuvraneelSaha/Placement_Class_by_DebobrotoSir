import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st number :");
        int a1 = in.nextInt();
        System.out.printf("Factorial of %d is %d ",a1,Factorial(a1));
        System.out.println("Please enter the 2nd number :");
        int a2 = in.nextInt();
        System.out.printf("Factorial of %d is %d ",a2,Factorial(a2));
        System.out.println("Please enter the 3rd number :");
        int a3 = in.nextInt();
        System.out.printf("Factorial of %d is %d ",a3,Factorial(a3));

    }
    public static int Factorial(int n)
    {
        // 5 - 5 4 3 2 1
        int sum = 1;

        for (int i = n; i >=1 ; i--)
        {
            sum = sum * i ;
        }
        return sum;
    }
}
