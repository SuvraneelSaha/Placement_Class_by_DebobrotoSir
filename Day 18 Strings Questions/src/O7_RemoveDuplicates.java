import java.util.Scanner;
/*
Happy NEEW YEEar
hapy NEW Year
 */
public class O7_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String word ="";

        for (int i = 0; i <= s.length()-2; i++)
        {
            char ch = s.charAt(i);
            if(s.charAt(i+1)!= ch)
            {
                word = word + ch;
            }

        }

        word = word + s.charAt(s.length()-1);
        System.out.println(word);
    }
}
