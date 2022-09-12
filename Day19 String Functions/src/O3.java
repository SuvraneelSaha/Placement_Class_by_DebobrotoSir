public class O3 {
    public static void main(String[] args) {
        // Reverse Printing
        String s = "I Love India";
        s= " " + s;

        String word ="";

        for (int i = s.length()-1; i >= 0; i--)
        {
            char ch = s.charAt(i);

            if(ch!=' ')
            {
              word = word+ch;
            }
            else
            {
                System.out.print(word);
            }

        }
    }
}
