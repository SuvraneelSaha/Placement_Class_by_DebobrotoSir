public class O4 {
    public static void main(String[] args) {
        String s="I LOVE LOVE INDIA";
        s=" "+s;
        String word="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                word=word+s.charAt(i);
            }
            else
            {
                System.out.println(word);
                word="";
            }
        }

    }
}
