import java.util.Scanner;

public class O12 {
    public static void main(String[] args) {
        // Magic Numbers
        // 5 25 30 125 130
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number:");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a valid Input ");
            System.out.println("Enter a Number :");
            in.next();
        }
        int n = in.nextInt();

    }

    static boolean IsMagicNumbers(int n)
    {

    }
}
