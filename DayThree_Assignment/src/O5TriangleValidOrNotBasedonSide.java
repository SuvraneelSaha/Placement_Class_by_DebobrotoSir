import java.util.Scanner;

public class O5TriangleValidOrNotBasedonSide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st side");
        int a = in.nextInt();
        System.out.println("please enter the 2nd side");
        int b = in.nextInt();
        System.out.println("please enter the 3rd side");
        int c = in.nextInt();

        if(a+b>c || b+c>a || a+c>b)
        {
            System.out.printf("Triangle valid %d %d %d ",a,b,c);
        }
        else
        {
            System.out.println("NA not valid");
        }
    }
}
// for a  triangle to be valid the 2 sides should be greater than the 3rd side