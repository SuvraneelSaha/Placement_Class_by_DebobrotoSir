import java.util.Scanner;

public class O10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s=s+" ";

        String word = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch!=' ')
            {
                word = word + ch;
            }
            else
            {
                System.out.print(word.length()+" ");
                word="";
            }
        }
    }
}
