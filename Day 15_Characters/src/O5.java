import java.util.Scanner;

// Printing the Capital Letter Alphabets along with their Ascii values

public class O5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (char i = 'A'; i <= 'Z' ; i++) {
            //System.out.print(i + " ");
            System.out.println(i + " " +(int)i);
        }
    }
}
