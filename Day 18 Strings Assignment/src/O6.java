import java.util.Scanner;

public class O6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int countConsonants = 0 ;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o'||ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {

            }
            else if(ch==' ')
            {

            }
            else
            {
                countConsonants++;
            }

        }
        System.out.println("the number of vowels is "+countConsonants);
    }
}
