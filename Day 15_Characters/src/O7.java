public class O7 {
    public static void main(String[] args) {
        // longest line first -- print it first
        for(int x=65;x<=68;x++) // here we can directly use the Characters also
        {
            for (int i = 65; i <= x; i++) // by using the Ascii value
            // we can directly use the character
            {
                System.out.print((char) i);
            }
            System.out.println();
        }
    }
}
/*

A
AB
ABC
ABCD
 this is the pattern
 */