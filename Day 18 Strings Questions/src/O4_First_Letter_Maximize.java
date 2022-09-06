import java.util.Scanner;

public class O4_First_Letter_Maximize {
    public static void main(String[] args) {
        // first letter maximize
        // Ex - inDia
        // o/p - India
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res ="";

        char c = s.charAt(0);
        if(c>='a' && c<='z')
        {
            res = res + (char)(c-32);
        }
        else
        {
            res = res + c;
        }

        for (int i = 1; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch >='A' && ch <='Z')
            {
                res = res+(char)(ch +32);
            }
            else
            {
                res = res + ch;
            }
        }
        System.out.println(res);
    }
}
