public class O10 {
    public static void main(String[] args) {
        String s = "I love love India";
        // max word
        s=s+" ";
        String word =  "";
        String maxWord =s;
        int max = 0 ;
        int count = 0 ;

        for (int i =0; i < s.length() ; i++)
        {
            if(s.charAt(i)!=' ')
            {
                word= word + s.charAt(i);
                if(s.charAt(i) == 'a' ||s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A'||s.charAt(i) == 'E' ||  s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' )
                {
                    count ++ ;
                }
            }
            else
            {
                if(count > max)
                {
                    maxWord = word;
                    max = count; // highes word count
                }
                word="";
                count = 0 ;
            }
        }
        System.out.println(maxWord);
    }
}
