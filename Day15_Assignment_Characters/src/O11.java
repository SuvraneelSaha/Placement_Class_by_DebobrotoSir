import java.util.Scanner;

public class O11 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int sum = 0;

        while (true)
        {
            System.out.println("Please enter a number ");
            int n = in.nextInt();
            sum = sum + n;
            System.out.println("Press Y to continue or N to Stop");
            char res = in.next().charAt(0);
            if (res == 'Y') {
                continue;
            } else if (res == 'N') {
                break;
            } else {
                System.out.println("Invalid order ");
                continue;
            }
        }
        System.out.println("the Result is "+sum);
    }
}

