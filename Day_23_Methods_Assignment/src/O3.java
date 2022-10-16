import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        // print the sum of their factorial
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st number :");
        int a1= in.nextInt();
        System.out.println("Please enter the 2nd number :");
        int a2= in.nextInt();
        System.out.println("Please enter the 3rd number :");
        int a3= in.nextInt();



        System.out.println("The sum of the Factorials of the 3 numbers is "+Sum(a1,a2,a3));

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
    public static int Sum(int a , int b , int c)
    {
        int sum = 0 ;
        sum = Factorial(a) + Factorial(b) + Factorial(c);
        return sum;
    }

}
