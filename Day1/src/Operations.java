import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st num ");
        int a = in.nextInt();
        int b = in.nextInt();
        double c = in.nextDouble();
        c= a/b ;
        System.out.println(c);
    }
}
