public class O8 {
    public static void main(String[] args) {
        // longest line first -- print it first
        for(int x='A';x<='D';x++) // we can also use the for loop by using characters also
            // and by assigning characters to int which will eventually will take ascii values of those
            // characters
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
