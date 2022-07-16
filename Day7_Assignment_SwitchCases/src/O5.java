import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        // check if a user given alphabet is a vowel or a consonant
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter Alphabet ");
        while (!in.hasNext("[a-z]"))
        {
            System.out.println("please enter a valid alphabet ");
            in.next();

        }
        char n = in.next().charAt(0);
        switch (n)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel "+n);
                break;
                // break is needed otherwise it will perform
            // fall through error

            default:
                System.out.println("Consonant "+n);

        }

    }
}
