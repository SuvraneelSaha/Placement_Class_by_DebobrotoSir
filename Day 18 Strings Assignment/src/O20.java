public class O20 {
    public static void main(String[] args) {
        String s = "mohan das karam chand gandhi";
        s=s+' ';
        String word ="";
        String res="";
        res = res + upperCase(s.charAt(0))+'.';
        for (int i = 0; i < s.length()-1; i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                word = word + ch;
            }
            else
            {
                res = res + (char)(s.charAt(i+1)-32)+'.';
                word="";
            }
        }
        System.out.println(res);
    }
    public static char upperCase(char ch)
    {
        if(ch>='a' && ch<='z')
        {
            ch = (char)(ch-32);
        }
        return ch;
    }
}
