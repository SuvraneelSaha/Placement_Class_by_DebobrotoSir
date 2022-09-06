public class O1_Reverse_String_M_Intact {
    public static void main(String[] args) {
        /*
        HAPPY NEW YEAR 2022
        2022 YEAR NEW HAPPY
        O/P
        // the question was this and i myself was unable to do this
        follow the 2nd code for the solution
         */

        String s = "HAPPY NEW YEAR 2022";
        s=' '+s;

        String word = "";

        for (int i = s.length()-1; i >=0 ; i--)
        {
            char ch = s.charAt(i);
            if(ch !=' ')
            {
                word = ch + word;
            }
            else
            {
                System.out.print(word+" ");
                word="";
            }
        }


    }
}
