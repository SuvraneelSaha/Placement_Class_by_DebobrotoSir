import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a character :");
        char letter = in.next().charAt(0);
        System.out.printf("the ascii value of the letter %c is %d",letter,(int)letter);
    }
}
