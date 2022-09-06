public class O2_WordFetch {
    public static void main(String[] args) {
        /*
        HAPPY NEW YEAR 2022
        WORD 1 : HAPPY
        WORD 1 : NEW
        WORD 1 : YEAR
        WORD 1 : 2022

        this is not the correct way to do so but see the o/p so that we can understand where
        it went wrong

         */

        String s = "HAPPY NEW YEAR 2022";

        for(int i = 0,d=1 ; i<s.length();i++,d++)
        {
            String word ="";
            if(s.charAt(i)!=' ')
            // ie until and unless a space is found
            {
                word = word + s.charAt(i);
            }
            System.out.printf("Word %d : %s",d,word);
            System.out.println();
        }
    }
}
