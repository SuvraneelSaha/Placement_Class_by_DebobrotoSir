public class O2_WordFetch_Sir {
    public static void main(String[] args) {
        // word fetch
        String s = "HAPPY NEW YEAR 2022";
        s=s+' ';
        // it will go to else if "space" is not provided to the last
        // word

        String word ="";

        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)!=' ')
            {
                word = word + s.charAt(i);
            }
            else
            {
                System.out.println(word);
                word="";
            }

        }
    }
}
