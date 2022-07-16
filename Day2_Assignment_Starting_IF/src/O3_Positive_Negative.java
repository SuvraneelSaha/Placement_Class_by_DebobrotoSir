import java.util.Scanner;

public class O3_Positive_Negative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the  number");
        while (in.hasNext("[a-z A-Z.]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();

        if(a>=0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}
