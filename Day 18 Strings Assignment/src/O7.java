import java.util.Scanner;
// find the number of words in the given string
public class O7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s=s+' ';
        String word ="";
        int countWord = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                word = word + ch;
            }
            else
            {
                countWord++;
                word="";
            }
        }
        System.out.println("The Number of Words is "+countWord);
    }
}
