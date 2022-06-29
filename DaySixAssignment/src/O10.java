import java.util.Scanner;

public class O10 {
    // find the sum of the odd positions of a number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int n = in.nextInt();

    }
    static void OddPositionSum(int n)
    {

    }

    static int Length(int n)
    {
        String num = Integer.toString(n);
        return num.length();
    }
}
