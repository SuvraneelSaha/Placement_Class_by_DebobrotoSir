import java.util.Scanner;

public class FibonacciSumA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = 0 ,y=1;
        int sum = 0 ;
        for (int i = 1; i <=10 ; i++)
        {
            int temp = x+y;
            x=y;
            y=temp;

        }
        System.out.println(sum);
    }
}
// 3 step approach for sum
// first initialize the sum outside the for loop
// sum = 0
// outside for loop print sum
// inside the for loop
// sum +
