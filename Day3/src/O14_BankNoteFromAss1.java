import java.util.Scanner;

public class O14_BankNoteFromAss1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the amount");
        int a = in.nextInt();


        System.out.printf("2000 rupess note = %d ",a/2000);
        a=a%2000;


        System.out.printf("500 rupee note =%d",a/500);
        a=a%500;
        //...
    }
}
// o/p approach - think in terms what the output will be and
// approach how it will come from the o/p
