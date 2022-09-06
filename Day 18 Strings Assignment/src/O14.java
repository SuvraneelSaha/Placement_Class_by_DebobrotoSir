import java.util.Scanner;

public class O14 {
    /*
    find the word with the maximum vowels and print it
    ex - India is Great
    o/p - India

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String s = in.nextLine();
        s=s+' ';
        String word ="";

        String maxVowels="";
        int vowels = 0 ;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                word = word + ch;

            }
            else
            {
                if(VowelCount(word) > VowelCount(maxVowels))
                {
                    maxVowels = word;
                }
                word="";
            }
        }
        System.out.println(maxVowels);

    }
    public static int VowelCount(String s)
    {
        int vowels=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o'||ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                vowels++;
            }
        }
        return vowels;
    }
}
