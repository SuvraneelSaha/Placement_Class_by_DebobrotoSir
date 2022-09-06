import java.util.Scanner;

public class O16 {
    /*
    Convert it into upperCase
    ex - India is Great
    o/p INDIA IS GREAT
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        s=s+' ';

        String word ="";
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
                {
                    if(ch>='a' && ch<='z')
                    {
                        word = word + (char)(ch-32);
                    }
                    else
                    {
                        word = word + ch;
                    }
                }
                else
                {
                    word = word + ch;
                }

            }
            else
            {
                System.out.print(word +" ");
                word="";
            }
        }
    }
}
