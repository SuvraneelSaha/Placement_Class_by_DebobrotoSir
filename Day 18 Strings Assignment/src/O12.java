import java.util.Scanner;

public class O12 {
    // find the largest word in a given string and print it
    // ex - India is great
    // o/p = India
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s=s+' ';

        String word ="";

        String maxWord="";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                word = word + ch;
            }
            else
            {
                if(word.length() > maxWord.length())
                {
                    maxWord = word;
                }
                word="";
            }
        }
        System.out.println(maxWord);

    }
}
