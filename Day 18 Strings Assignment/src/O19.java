public class O19 {
    /*
    mohan das karam chand gandhi
    o/p mdkcg
    ie each first letter from each word
     */

    public static void main(String[] args) {
        String s = "mohan das karam chand gandhi";
        s=s+' ';
        String word ="";
        String res="";
        res = res + s.charAt(0);
        for (int i = 0; i < s.length()-1; i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                word = word + ch;
            }
            else
            {
                res = res + s.charAt(i+1);
                word="";
            }
        }
        System.out.println(res);

    }
}
