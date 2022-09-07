public class O24 {
    /*
    Palindromic String or not
    ex - madam
    then opposite will be madam
    ex - if nigga
    then opposite will be aggin != nigga so not palindromic
     */
    public static void main(String[] args) {
        String s= "madam";
        String temp =s;
        s=' '+s;
        String word ="";
        int flag = 1 ;
        for (int i = s.length()-1; i >=0 ; i--)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                word = word + ch;
            }
            else
            {
                if(word.equals(temp))
                {

                    System.out.println("Palindrome");

                }
                else
                {
                    flag = 0;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("Not Palindrome");

        }

    }
}
