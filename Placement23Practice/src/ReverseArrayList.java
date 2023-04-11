
    import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

    public class ReverseArrayList {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            // Create an ArrayList of integers
            ArrayList<Integer> list = new ArrayList<>();

            // Accept N integers and add them to the list
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            // Print the initial list
            System.out.println(list);

            // Reverse the list in place
            int left = 0;
            int right = n - 1;
            while (left < right) {
                Collections.swap(list, left, right);
                System.out.println(list);
                left++;
                right--;
            }
        }
    }


