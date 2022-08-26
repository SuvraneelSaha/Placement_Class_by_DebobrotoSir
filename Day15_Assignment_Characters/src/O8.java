import java.util.Locale;
import java.util.Scanner;

public class O8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a character:");

        char n = '0';
        if (in.hasNext("[a-z]+")) {
            n = in.next().charAt(0);

        }
        char res = Character.toUpperCase(n);
        // using the Character wrapper class

        System.out.println("Upper case Letter of "+n+" is "+res);


       // System.out.println(n);
    }
}
