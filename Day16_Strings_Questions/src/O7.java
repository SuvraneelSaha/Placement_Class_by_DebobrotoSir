public class O7 {
    public static void main(String[] args) {
        // palindrome string
        String s = "madam";

        String rev ="";
        // empty string

        for (int i = s.length()-1; i >=0 ; i--)
        {
            rev = rev + s.charAt(i); // here we can use stringbuilder
            // + means concatenation in case of strings
        }

        System.out.println(rev + " " + s);

        if(s.equals(rev)) // in case of strings use .equals
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
