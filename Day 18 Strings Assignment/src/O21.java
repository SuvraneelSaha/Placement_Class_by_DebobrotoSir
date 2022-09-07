public class O21 {
    /*
     String s = "mohan das karam chand gandhi";

    o/p - Mohan Das Karam Chand Gandhi
     */
    public static void main(String[] args) {
        String s = "mohan das karam chand gandhi";

        String word ="";
       char c = s.charAt(0);
       if(c>='a' && c<='z')
       {
           word = word + (char)(c-32);
       }
       else
       {
           word = word + c;
       }


        for (int i = 1; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                word = word+ch;
            }
            else
            {
                System.out.print(word + " ");
                word="";
                word = word + (char)(s.charAt(i+1)-32);
                i++;
            }


        }
        System.out.print(word);
    }
}
