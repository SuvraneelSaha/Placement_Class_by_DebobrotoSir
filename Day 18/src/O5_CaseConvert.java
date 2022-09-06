import java.util.Scanner;

public class O5_CaseConvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res ="";
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch >='A' && ch <='Z')
            {
                res = res+(char)(ch +32);
            }
            else if(ch>='a' && ch<='z')
            {
                res = res +(char)(ch-32);
            }
            else
            {
                res = res + ch;
            }

        }
        System.out.println(res);
    }
}
