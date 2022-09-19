import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class O12 {
    public static void main(String[] args) throws IOException
            // throws will give a decleration
            // but they wont take any actions

    {
        System.out.println(2+2+"hi"+2+2);
        // when a string gets encountered
        // then it will convert the whole thing into a String

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // by default buffer reader takes input in Strings by default
        // it catches the input from the keyword and allocates it
        // in the memory
        System.out.println("Enter a number:");
        String s = br.readLine();
        int x = Integer.parseInt(s);
        System.out.println(x);


    }
}
