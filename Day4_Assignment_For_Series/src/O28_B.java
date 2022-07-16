import java.util.Scanner;

public class O28_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N ");
        int n = in.nextInt();
        System.out.println("Please enter a number");

        int num = in.nextInt();
        for (int i = n; i >=1 ; i--)
        {
            System.out.print(num + " ");
            num=num/10;
        }
    }
}
// 11111 1111 111 11 1
// or
// 2222 222 22 2
