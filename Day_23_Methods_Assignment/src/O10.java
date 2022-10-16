import java.util.Scanner;

public class O10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the base value");
        int base = in.nextInt();
        System.out.println("Enter the Exponential value");
        int exp = in.nextInt();

        int ans = Power(base,exp);

        System.out.printf("%d to the power of %d = %d  ",base,exp,ans);


    }
    public static int Power(int a , int b)
    {
        return (int)Math.pow(a,b);
    }
}
