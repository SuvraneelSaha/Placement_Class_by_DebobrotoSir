import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the year :");
        int y = in.nextInt();

        if(y%4==0)
        {
            System.out.println(+y+" leap year");
        }
        else
        {
            System.out.println(+y+" Not a leap year");
        }



    }
}
// simple logic by calculating which year is a leap year or not
// % 4 == 0 --> then leap year

// the logic construction can be different from code to code
// but the end final or ultimate end product must be the same

