public class O2_PrintDuplicatesSir {
    public static void main(String[] args) {
        // if the l comes in the past then we will not count it in the future
        // Print only Duplicate elements
        String s = "I LOVE LOVE INDIA";

        for (int j = 0; j < s.length(); j++)
        {
            char c =s.charAt(j);
            boolean found = false;
            for (int i = 0; i < j; i++)
            {
                if(s.charAt(i) == c)
                {
                    found = true;
                }
            }
            if(!found)
            {
                int count = 0;
                for (int i = j; i < s.length(); i++) // or if i = 0 for starting from 0
                {
                    if (s.charAt(i) == c) {
                        count++;
                    }
                }
                if (count > 1) {

                    System.out.println(c);
                }
            }

        }
    }
}
