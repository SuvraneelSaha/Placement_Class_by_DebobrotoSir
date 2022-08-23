import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        // identifying a character
        Scanner in = new Scanner(System.in);
        System.out.println("enter a character:");
        char c = in.next().charAt(0);
        int a = (int)c;
        // we are comparing the character using the type casting
        if((a>=65 && a<=90) || (a>=97 && a<=122))
            System.out.println("It is an alphabet");
        else
            System.out.println("it is NOT an alphabet");
    }
}
