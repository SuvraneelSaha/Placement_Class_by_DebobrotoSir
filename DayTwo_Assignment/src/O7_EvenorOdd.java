import java.util.Scanner;

public class O7_EvenorOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the num");
        int a = in.nextInt();
        if(a%2==0)
        {
            System.out.println(a+" even num");
        }
        else
        {
            System.out.println("odd");

        }
    }
}
