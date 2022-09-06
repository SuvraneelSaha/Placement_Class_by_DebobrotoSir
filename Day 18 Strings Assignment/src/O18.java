public class O18 {
    public static void main(String[] args) {
        /*
        Change the Case
        ex - India is Great
        op - iNDIA IS gREAT

         */
        String s = "India is Great";
        s=s+' ';

        String word="";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
                {
                    if(ch>='a' && ch<='z')
                    {
                        word = word + (char)(ch-32);
                    }
                    else
                    {
                        word = word +(char)(ch+32);
                    }
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
