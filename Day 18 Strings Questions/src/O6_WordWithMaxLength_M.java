import java.util.Scanner;

public class O6_WordWithMaxLength_M {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s=s+' ';
        String word ="";

        String maxword ="";


        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
                if(ch==' ')
                {
                    if(word.length() > maxword.length())
                    {
                        maxword = word;
                    }
                    word="";
                }
                else
                {
                    word = word + ch;
                }
        }
        System.out.println(maxword);
    }
}
