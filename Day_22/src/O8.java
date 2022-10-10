import java.util.Scanner;

public class O8 {
    public static void main(String[] args) {

        // for code modularity

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = in.nextInt();
        System.out.printf("Reverse = %d ",Reverse(a));
    }
    public static int Reverse(int a)
    {
        int r=0;
        int rev = 0 ;
        while (a!=0)
        {
            r=a%10;
            rev = rev*10+r;
            a=a/10;

        }
        return rev;
    }
}
