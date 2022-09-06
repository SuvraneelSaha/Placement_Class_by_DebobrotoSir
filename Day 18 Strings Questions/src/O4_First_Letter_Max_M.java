import java.util.Scanner;

public class O4_First_Letter_Max_M {
    public static void main(String[] args) {
        /*
          // first letter maximize
        // Ex - inDia
        // o/p - India
         */
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String word ="";

        char c = s.charAt(0);
        if(c>='a' && c<='z')
        {
            word = word + (char)(c-32); // converting the 1st character into Capital letter

        }
        else
        {
            word = word + c ;
        }

        for (int i = 1; i <s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch >='A' && ch<='Z')
            {
                word = word + (char)(ch+32);
            }
            else
            {
                word = word + ch;
            }
        }
        System.out.println(word);

    }
}
