import java.util.Scanner;

public class O13 {
    /*
    find the smallest word in a given string
    ex - India is great
    o/p: is
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        s=s+' ';

        String word ="";
        String minWord=s;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                word = word + ch;
            }
            else
            {
                if(word.length()<minWord.length())
                {
                    minWord = word;
                }
                word="";
            }
        }
        System.out.println(minWord);
    }
}
