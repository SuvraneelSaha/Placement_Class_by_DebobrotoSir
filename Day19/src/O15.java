public class O15 {
    public static void main(String[] args)
    {
        boolean m = true ;
        String  s1 ="I love India";
        String s2 ="I Love India";

        for (int i = 0; i < s1.length(); i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                m = false;
                break;
            }
        }

    }
}
