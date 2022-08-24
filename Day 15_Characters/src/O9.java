public class O9 {
    public static void main(String[] args) {
        // longest line first -- print it first
        for(char x='E';x>='A';x--)
            // here the for loop is being run by the character variables
            // so we can take any type of var and can run the for loop
            // no need to restrict ourselves to using only integer for using the for loop
        {
            for (char i = x; i <= 'E'; i++) // by using the Ascii value
            // we can directly use the character
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
E
DE
CDE
BCDE
ABCDE
this is the pattern
 */
