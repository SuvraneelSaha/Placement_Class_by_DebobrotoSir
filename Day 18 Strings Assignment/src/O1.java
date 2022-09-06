public class O1 {
    public static void main(String[] args) {
        String s = "Hello India";
        s=s+' ';
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
                if(ch!=' ')
                {
                    System.out.println(ch);
                }
                else
                {
                    System.out.println();
                }
        }
    }
}
