public class O10 {
    // good name
    public static void main(String[] args) {
        String s = "SUBHAM RAJANYA RAHUL";


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
        System.out.println(word);
    }
}
