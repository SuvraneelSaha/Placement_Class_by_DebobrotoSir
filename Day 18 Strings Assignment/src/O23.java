public class O23 {
    /*
    comparing two strings lexicographically
    ex -i/p  Happy New Year
        i/p - happy new year
        if i/p hanny new year - o/p different
        o/p same

     */
    public static void main(String[] args) {
        String s= "Happy New Year";
        s=s+' ';
        String res ="happY new year";
        res = res +' ';
        String word1="";
        String word2="";

        int flag = 1 ;
        for (int i = 0; i < s.length(); i++)
        {
            if(s.length() != res.length())
            {
                flag = 0;
                break;
            }
            int charType = 1;
            char ch1 = s.charAt(i);
            char ch2 = res.charAt(i);
            if(ch1!=' ' && ch2!= ' ')
            {

                if(ch1>='a' && ch1<='z') //||(ch1>='A' && ch1<='Z'))
                {
                    charType = 0 ;
                    word1 =word1 + ch1;
                    if(ch2>='A' && ch2<='Z')
                    {
                        ch2 = (char)(ch2+32);
                        word2 = word2 + ch2;
                    }
                    else
                    {
                        word2 =  word2 + ch2;
                    }
                }
                else
                {
                    if(ch1>='A' && ch1<='Z')
                    {
                        charType=1;
                        word1 = word1 + ch1;
                        ch2 = (char)(ch2-32);
                    }

                    word2 = word2 + ch2;
                }




            }
            else
            {
                if(stringMatch(word1,word2) == true)
                {
                        flag = 1 ;
                }
                else
                {
                    flag = 0;
                    break;
                }

            }
        }
        if(flag==0)
        {
            System.out.println("Not same");

        }
        else
        {
            System.out.println("same");
        }
    }

    public static boolean stringMatch(String word1,String word2)
    {
        if(word1.equals(word2))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
