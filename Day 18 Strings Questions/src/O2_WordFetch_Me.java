public class O2_WordFetch_Me {
    public static void main(String[] args) {
        /*
         HAPPY NEW YEAR 2022
        WORD 1 : HAPPY
        WORD 1 : NEW
        WORD 1 : YEAR
        WORD 1 : 2022
         */

        String s = "HAPPY NEW YEAR 2022";
        s= s+ ' '; // single character
        String word ="";

        for (int i = 0,k=1; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                System.out.printf("Word %d:%s",k,word);
                System.out.println();
                word="";
                k++;
            }
            else
            {
                word = word+ch;
            }

        }


    }
}
