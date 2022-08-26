import java.util.Scanner;

public class O7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a character:");
        char n = in.next().charAt(0);
        if((n>='A' && n<='Z')||(n>='a' && n<='z'))
        {
            if((n>='a' && n<='y') || (n>='A' && n<='Y'))
            {
                System.out.println((char)(n+1) +" next character");
            }
            else
            {
                System.out.println("Last character");
            }
        }
        else
        {
            System.out.println(n+" it is not an alphabet");
        }
    }
}
