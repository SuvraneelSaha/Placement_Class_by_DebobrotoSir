import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a ascii value");
        int n = in.nextInt();
        System.out.printf("the ascii value %d has a character %c",n,(char)n);
    }
}
