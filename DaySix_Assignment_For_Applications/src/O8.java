import java.util.Scanner;

public class O8 {
    // check if the given number is palindrome or not
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        while (!in.hasNext("[0-9]+")) {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int n = in.nextInt();
        if (n == Reverse(n)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not");
        }


    }

    static int Reverse(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        return sum;
    }
}
