import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of terms :");
        int n = in.nextInt();
        for (int a = 1; a <=n ; a++)
        {
            System.out.print(a%2 + " ");
        }
    }
}
// 1 0 1 0 1 0 ...
// if condition increases the time complexity so we have directly used it
// actually time complexity increases based on the for loop but we are learning from the start that if also contributes to it
