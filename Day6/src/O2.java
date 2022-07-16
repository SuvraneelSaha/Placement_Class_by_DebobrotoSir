import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // if n is 53
        for (int i = n; i >=1 ; i-=2)
        {
            System.out.print(i +" ");
        }
        System.out.println();
        ReverseSeries(n);
    }
    static void ReverseSeries(int n)
    {
        if(n%2==1)
        {
            n=n-1;
            // reducing the n to n-1
            // ie we are changing the odd number to the even number

        }
        for (int i = n; i >=1 ; i-=2)
        {
            System.out.print(i +" ");
        }
    }
}
// n n-2 n-4 n-6 n-8 ... 0
