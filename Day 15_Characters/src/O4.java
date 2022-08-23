import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a character:");
        char c = in.next().charAt(0);
        // comparison can be done by using the characer or either the
        // Ascii code of that character
        //
        if((c>='A' && c<='Z') || (c>=97 && c<=122))
            System.out.println("It is an alphabet");
        else
            System.out.println("it is NOT an alphabet");
    }
}
