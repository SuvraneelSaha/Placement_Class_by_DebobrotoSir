import java.util.Scanner;

public class O17 {
    /*
    Enter a string and convert it to lowercase
    ex - India is Great
    o/p - india is great
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
                    if(ch>='A' && ch<='Z')
                    {
                        word = word + (char)(ch+32);
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
