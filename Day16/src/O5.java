public class O5 {
    public static void main(String[] args) {
        // enter a string and find the number of consonants in it

        String s="Nigga";

        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {

            char c = s.charAt(i);
            if((c>='A' && c<='Z') || (c>='a' && c<='z'))
            {


                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                {

                }
                else
                {
                    count++;
                }
            }
        }
        System.out.println("the number of consonants = "+count);
    }
}
