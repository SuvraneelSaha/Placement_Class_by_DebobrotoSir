import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        // special number - lucky number
        // ex - 1 2 3 4 5 6 7 8 9 10
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = i + 1 ;
        }

        int count = 2 ;

        while (count<=n) {


            int pos = 0;

            int[] b = new int[arr.length];
            for (int i = 0, c = 1; i < arr.length; i++) {
                if (c % count != 0)
                {
                    b[pos] = arr[i];
                    pos++;

                }
            }
            arr = b;
            n = pos;

            for (int i = 0; i < pos; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            count=count+1;


        }
    }
}
