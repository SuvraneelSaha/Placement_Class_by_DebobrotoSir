import java.util.Scanner;

public class O9 {
    // enter a number and find the sum of the even digits of the number
    //ex - 4572 -- sum = 4 + 2 = 6
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int n = in.nextInt();
        EvenSum(n);

    }
    static void EvenSum(int n)
    {
        int Og = n;
        int sum = 0;
        while (n>0)
        {
            int rem = n%10 ;
            if(rem%2==0)
            {
                sum = sum + rem;
            }
            n = n/10;
        }
        System.out.printf("the sum of the even digits of the number %d is %d",Og,sum);
    }
}
