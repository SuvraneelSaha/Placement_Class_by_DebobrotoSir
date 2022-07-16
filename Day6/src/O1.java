import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        // For series discussion
        // 2 4 6 8 ..
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 2; i <=n ; i+=2)
        {
            System.out.print(i + " ");
        }
    }
}
