import java.util.Scanner;

public class O1_MaximumandMinimumof3Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 3 numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.printf("max of %d %d and %d is %d",a,b,c,Math.max(Math.max(a,b),c));


    }
}
