public class O6 {

    // Important
    // Handling many spaces
    public static void main(String[] args) {
        String s = "I         LOVE       LOVE        INDIA";
        s=" "+s;
        String word ="";
        String res ="";


        for (int i = s.length()-1; i >= 0; i--)
        {
                if(s.charAt(i)!=' ')
                {
                    word = s.charAt(i) + word;
                }
                else
                {
                    res = res+" "+ word;
                    res = res.trim();
                    word ="";
                }
        }
        System.out.println(res);



    }
}
