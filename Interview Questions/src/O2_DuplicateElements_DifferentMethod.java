public class O2_DuplicateElements_DifferentMethod {
    /*
    Happy NEEW YEEar
    hapy NEW Year
    Remove Duplicate elements from the String

     */
    public static void main(String[] args) {
        String s = "Happy Neew Year";
        s=s+' ';
        String word = "";
        int i;
        for ( i = 0; i < s.length()-2; i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                if(s.charAt(i+1)!=ch)
                {
                    word = word+ch;
                }
            }
            else
            {
                System.out.print(word +" ");
                word="";
            }
        }
        word = word + s.charAt(i);
        System.out.print(word);
    }
}
