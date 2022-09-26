public class O1 {
    public static void main(String[] args)
    {
        //8.2 assignment both preseent
        // word found in case of a string
    String s = "HAPPY NEW YEAR";
    String wrd = "PPY";
    boolean f = false;
        for (int i = 0; i <=s.length()-wrd.length() ; i++)
        {
            boolean eq = true;

            for (int j = 0; j <=wrd.length()-1 ; j++)
            {
                if(wrd.charAt(j)!=s.charAt(i+j))
                {
                    eq = false;
                    break;
                }
            }
            if(eq)
            {
                f=true;
                break;
            }
        }
        if(f)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");

        }
    }
}
