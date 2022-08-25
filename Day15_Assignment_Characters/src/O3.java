import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a digit :");
        int n = in.nextInt();
        System.out.println("Number : "+n);
        System.out.println("Please enter a symbol :");
        char symbol = in.next().charAt(0);
        System.out.println("Symbol :"+symbol);
        System.out.println("Please enter a uppercase letter :");
        char upperCase = in.next().charAt(0);
        System.out.println("Uppercase letter :"+upperCase);
        System.out.println("Please enter a lowercase letter :");
        char lowerCase = in.next().charAt(0);
        System.out.println("Lowercase Letter : "+lowerCase);


    }
}
