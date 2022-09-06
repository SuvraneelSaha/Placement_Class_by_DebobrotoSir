import java.util.Scanner;

public class O8_WordWithMinLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s=s+" ";
        String word ="";


        String minWord = s ;

        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)!=' ')
            {
                word = word + s.charAt(i);
            }
            else
            {
                if(word.length() < minWord.length())
                {
                    minWord = word;
                }

                word="";
            }
        }
        System.out.println(minWord);
    }
}
