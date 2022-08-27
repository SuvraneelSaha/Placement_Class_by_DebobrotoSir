public class O12 {
    // 11 hobe etah
    public static void main(String[] args) {
        // subham sangita ankit
        // reverse each word
        // mahbus atignas tikna
        // words are reversed but the sequnce is not reversed
        String s = "SUBHAM RAJANYA RAHUL";


        int count = 1;

        String word ="";

        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)!=' ')
            // ie until and unless a space is found
            {
                word = s.charAt(i) + word;
            }
            else
            {
                System.out.print(word + " ");
                count++;
                word="";
            }

        }
        System.out.println(word);
    }
}
