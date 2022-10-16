import java.util.Scanner;

public class O15 {

    // 1!/1 + 2!/2 + 3!/3 + 4!/4 + 5!/5
    // 1 + 1 + 2 + 6 + 24 = 34

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the number:");
        int n = in.nextInt();
        int ans = Operation(n);
        System.out.printf("the sum of the series upto %d is %d",n,ans);


    }
    public static int Operation(int n)
    {
        int sum = 0 ;
        for (int i = 1; i <=n ; i++)
        {
                sum = sum + Factorial(i)/i;

        }
        return sum;
    }
    public static int Factorial(int n) // ex 5 - 5 4 3 2 1
    {
        int sum = 1;
        for (int i = n; i >=1 ; i--)
        {
                sum = sum * i;
        }
        return sum;
    }
}
