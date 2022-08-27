public class O11 {
    public static void main(String[] args) {
        // case change
        // ex - SoUmya BaniBraTa SuBHdeep
        // o/p Soumya Banbrata Subhdeep // all capital
        String s = "SoUmya BaniBraTa SuBHdeep";


        int count = 1;

        String res ="";

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c>='a' && c<='z')
            // ie until and unless a space is found
            {
                res = res + (char)(c-32);
                // for converting from lowercase to uppercase
            }
            else
            {
              res += c ;  // if the char is in uppercase it stays in uppercase
            }

        }
        System.out.println(res);

    }
}
