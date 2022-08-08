public class O8 {
    public static void main(String[] args) {
        String s = "AAABBBCCC";

        char c = 'A';
        int count=0;
        for (int i = 0; i <s.length() ; i++)
        {
            if(s.charAt(i)==c)
            {
                count++;
            }
            else
            {
                break;
            }
        }
        c=(char)(c+1);

    }

}
