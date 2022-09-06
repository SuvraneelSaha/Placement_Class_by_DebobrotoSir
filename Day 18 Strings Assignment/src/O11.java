public class O11 {
    /*
    enter a string and enter the number of vowels in each word
    ex - I love India
    o/p 1 2 3
     */
    public static void main(String[] args) {
        String s = "I love India";
            s=s+' ';

            int vowels = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o'||ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    vowels++;
                }
            }
            else
            {
                System.out.print(vowels + " ");
                vowels=0;

            }
        }
    }
}
