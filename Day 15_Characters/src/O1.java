import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a character:");
        char a = in.next().charAt(0); // for taking a single character

        System.out.println(a);
        // if we enter a word or a line of words ie a sentence then the charAt() method will take the
        // desired character only which is represented by an index


    }

}
