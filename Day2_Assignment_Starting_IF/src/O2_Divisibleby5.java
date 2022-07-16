import java.util.Scanner;

public class O2_Divisibleby5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the  number");
        while (in.hasNext("[a-z A-Z.]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();

        if(a%5==0)
        {
            System.out.println("Yes it is divisible");
        }
        else
        {
            System.out.println("NA");
        }
    }
}
