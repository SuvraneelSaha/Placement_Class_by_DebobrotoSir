public class O10 {
    public static void main(String[] args) {
        // longest line first -- print it first
        for(char x='E';x>='A';x--)
        {
            for (char i = 'A'; i <= x; i++) // by using the Ascii value
            // we can directly use the character
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
