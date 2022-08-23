public class O8 {
    public static void main(String[] args) {
        // longest line first -- print it first
        for(int x='A';x<='D';x++)
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
