public class O8 {
    public static void main(String[] args) {
        // word fetching
        // enter a string and print the words
        // ex - SUBHAM  RAJANYA RAHUL
        // word1 : SUBHAM
        // word2 : RAJANYA
        // word3 : RAHUL
        // very important question


        // split function later
        // as vowel collection - no readymade functions

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
                System.out.println("word "+count+ " : " +word);
                count++;
                word="";
            }

        }
    }
}
