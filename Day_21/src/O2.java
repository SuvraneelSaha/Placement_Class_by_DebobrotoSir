public class O2 {
    public static void main(String[] args) {
        // check if the two strings are lexicographically same
        // or not

        String s1 ="HAPPY NEW YEAR";
        String s2 = "Hampy New Year";
        boolean f = true;
        String s3 ="";
        String s4 ="";

        for (int i = 0; i < s1.length() ; i++)
        {
                if(s1.charAt(i)>='a' && s1.charAt(i) <='z')
                {
                    s3 = s3 + (char)(s1.charAt(i)-32);
                }
                else
                {
                    s3 = s3 +s1.charAt(i);
                }
        }

        for (int i = 0; i < s2.length(); i++)
        {
            if(s2.charAt(i)>='a' && s2.charAt(i)<='z')
            {
                s4 = s4 +(char)(s2.charAt(i)-32);
            }
            else
            {
                s4 = s4 + s2.charAt(i);
            }
        }

        if(s1.length()!=s2.length())
        {
           f= false;

        }
        else
        {
            for (int i = 0; i <s2.length() ; i++)
            {
                if(s3.charAt(i)!=s4.charAt(i))
                {
                    f=false;
                    break;
                }
            }
        }

        if(f)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Same ");
        }

    }
}
