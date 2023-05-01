package ShabNam_Milestone2_Mindtree;

import java.util.Scanner;

public class File {
    public static void main(String[] args) {
        // Read input from user
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        // Compute amoeba size using Fibonacci series
        int prev = 0, curr = 1, next;
        for (int i = 2; i <= month; i++) {
            next = prev + curr;
            prev = curr;
            curr = next;
        }

        // Print result
        System.out.println(curr);
    }
}
