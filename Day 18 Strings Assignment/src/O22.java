public class O22 {
    /*
    i/p "happy new year";
    the term to be searched = new
    if new present then True else false
     */
    public static void main(String[] args) {
        String s = "happy new year";
        s=s+' ';

        String search = "happy";
        int flag = 0 ;
        String word ="";
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                word = word+ch;
            }
            else
            {
                if(stringSearch(search,word))
                {
                    flag = 1 ;
                    System.out.printf("The Search String %s is found",search);
                    break;
                }
                word="";
            }
        }
        if(flag==0)
        {

            System.out.println("Not Found");
        }
        else
        {

        }
    }
    public static boolean stringSearch(String search, String word)
    {
        if(search.equals(word))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
