public class O2_RemoveDuplicates_M {
    public static void main(String[] args) {
        /*
        Happy NEEW YEEar
        hapy NEW Year
         */
        String s = "Hammppy NEEW YEEarr";

        String word = "";

        for (int i = 0; i <s.length()-1 ; i++)
        {
                char ch = s.charAt(i);
                if(s.charAt(i+1)!=ch)
                {
                    word=word+ch;
                }
        }
        word = word + s.charAt(s.length()-1);
        System.out.println(word);
    }
}
