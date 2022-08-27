public class O9 {
    public static void main(String[] args) {
        // initial of each word :
        // NETAJI SUBHASH CHANDRA BOSE
        // o/p - NSCB or
        String s = "SUBHAM RAJANYA RAHUL";
        s=s+" ";

        int count = 1;

        String word ="";

        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)!=' ')
            // ie until and unless a space is found
            {
                word = word + s.charAt(i);
            }
            else
            {
                System.out.print(word.charAt(0) + ".");
                count++;
                word="";
            }

        }
    }
}
