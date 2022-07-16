import java.util.Scanner;

public class O13_A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count of 1m Bricks: ");
        int b1=sc.nextInt();
        System.out.println("Enter the count of 5m Bricks: ");
        int b2=sc.nextInt();
        System.out.println("Enter the length of the wall: ");
        int len=sc.nextInt();
        if(b2<=len/5)
        {
            if(len%5<=b1)
            {
                System.out.println("Possible");
            }
            else
            {
                System.out.println("Impossible");
            }
        }
        else
        {
            System.out.println("Impossible");
        }
    }
}
