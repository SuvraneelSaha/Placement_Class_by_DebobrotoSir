import java.util.Scanner;

public class O5 {
    // krishnamurti number or not - ex - 145 --> 1! + 4! + 5! = 145

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = in.nextInt();
        // ex 145

        int temp = n; // why we dont need temp is that
        // when we are passing a value in a function by using call by value
        // then the original variable's value wont get changed
        // in the case of primitive data types

        // the value gets changed inside the function but outside the function that value doesnt gets
        // changed it happens inside the scope of the function only , not outside of the function .


        if(n==Operations(n))
        {
            System.out.println("Krishnamurti number");
        }
        else
        {
            System.out.println("Not");
        }


    }
    public static int Factorial(int n)
    {
        // 5 - 5 4 3 2 1
        int fact = 1;

        for (int i = n; i >=1 ; i--)
        {
            fact = fact * i ;
        }
        return fact;
    }

    public static int Operations(int n)
    {

        int sum=0;
        while (n!=0)
        {
            int rem = n%10;
            sum = sum + Factorial(rem);
            n=n/10;
        }
        return sum;
    }



}
