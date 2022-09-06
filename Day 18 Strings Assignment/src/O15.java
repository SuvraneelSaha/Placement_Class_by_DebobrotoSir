public class O15 {
    /*
    Change and replace all the 'a' with 'x'
     */
    public static void main(String[] args) {
        String s= "India is Great";
        s=s+' ';
        String word = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch!= ' ')
            {
                if(ch=='a' || ch=='A')
                {
                    word = word + 'x';
                }
                else
                {
                    word = word + ch;
                }

            }
            else
            {
                System.out.print(word +" ");
                word="";
            }
        }
    }
}
