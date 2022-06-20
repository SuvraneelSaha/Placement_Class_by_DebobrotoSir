import java.util.Scanner;

public class OkCancel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the 3 numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a==b && a==c)
        {
            System.out.println("OK");
        }
        else if(a!=b && a!=c && b!=c)
        {
            System.out.println("Ok");
        }
        else if(a==b || b==c || a==c)
        {
            System.out.println("Ok");
        }

    }
}
