public class O2 {
    public static void main(String[] args) {
        // print the duplicate characters
        String s = "I LOVE LOVE INDIA";




        for (int i = 0; i < s.length(); i++)
        {
            int count = 0 ;
            char ch = s.charAt(i);
            for (int j = i+1; j < s.length(); j++)
            {
                if(ch == s.charAt(j))
                {
                   count ++ ;
                }
                if(count>1)
                {
                    System.out.println(ch);
                }

            }

        }


    }
}
