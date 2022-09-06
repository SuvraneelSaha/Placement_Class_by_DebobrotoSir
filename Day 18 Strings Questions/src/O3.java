public class O3 {
    public static void main(String[] args) {
        String s = "HAPPY NEW YEAR 2022";
        s=" "+s;

        String word ="";

        for (int i = s.length()-1; i >=0; i--)
        {
            if(s.charAt(i)!=' ')
            {
                word =s.charAt(i)+word;
            }
            else
            {
                System.out.println(word);
                word="";
            }

        }
    }
}
