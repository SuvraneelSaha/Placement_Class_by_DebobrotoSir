import java.util.Scanner;

public class O5_CaseConvertM {
    public static void main(String[] args) {
        /*
        i/p - SuBham
        o/p - sUbHAM
         */
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String word = "";

        for (int i = 0; i <s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                word = word + (char)(ch+32);
            }
            else if(ch>='a' && ch<='z')
            {
                word = word + (char)(ch-32);
            }
            else
            {
                word = word + ch;
            }
        }
        System.out.println(word);
    }
}
