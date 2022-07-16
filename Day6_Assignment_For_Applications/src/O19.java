import java.util.Scanner;

public class O19 {
    // find minimum out of the given numbers
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the N");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int n = in.nextInt();
        System.out.println("Minimum = "+Min(n));

    }
    static int Min(int n)
    {
        Scanner in = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        System.out.println("Please enter the numbers");
        for (int i = 1; i <=n ; i++)
        {
            int a = in.nextInt();
            min = Math.min(min,a);
        }
        return min;
    }
}
