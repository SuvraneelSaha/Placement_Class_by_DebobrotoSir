import java.util.Scanner;

public class o27_Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter N");
        int n = in.nextInt();
        int a = 0,b=1,c=0;
        for (int i = 1; i <=n ; i++)
        {
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;


        }
    }
}
// in case of fibonacci always print the a first
// then think of the logic after that
// 1st step --
// Print a
// 2nd Step --
// Swap
// GO On
