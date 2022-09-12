public class O9 {
    public static void main(String[] args) {
        // * why we can use StringBuffer
        // smallest word

        String s = "I love love India";

        s=" " + s;
        String word =  "";
        String minWord =s;

        for (int i =0; i < s.length() ; i++)
        {
                if(s.charAt(i)!=' ')
                {
                    word= word + s.charAt(i);
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
