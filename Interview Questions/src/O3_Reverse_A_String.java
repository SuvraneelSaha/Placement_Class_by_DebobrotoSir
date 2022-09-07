public class O3_Reverse_A_String {
    /*
        HAPPY NEW YEAR 2022
        2022 YEAR NEW HAPPY


     */
    public static void main(String[] args) {
        String s = "HAPPY NEW YEAR 2022";
        s=' '+s;
        String word = "";

        for (int i = s.length()-1; i >=0; i--)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
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
