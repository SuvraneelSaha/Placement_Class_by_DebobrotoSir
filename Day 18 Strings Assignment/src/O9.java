public class O9 {
    public static void main(String[] args) {
        String s = "I Love India";
        s= ' '+ s;
        String word="";

        for (int i = s.length()-1; i >=0; i--)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                word = ch+word; // a ia dia ndia India
            }
            else
            {
                System.out.print(word+" ");
                word="";
            }
        }
    }
}
