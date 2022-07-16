import java.util.Scanner;

public class O8_EqualORNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the num");
        int a = in.nextInt();
        System.out.println("please enter the 2nd num");
        int b = in.nextInt();
        if(a==b)
        {
            System.out.println("both " +a+ " and" +b+" are same");
        }
        else
        {
            System.out.println("NA");
        }
    }
}
