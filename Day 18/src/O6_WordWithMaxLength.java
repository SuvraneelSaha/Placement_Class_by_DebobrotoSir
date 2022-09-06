import java.util.Scanner;
// For application chapter needs to be repeated
public class O6_WordWithMaxLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s=s+" ";
        String word ="";


        String  maxWord = "" ;

        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)!=' ')
            {
                word = word + s.charAt(i);
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
