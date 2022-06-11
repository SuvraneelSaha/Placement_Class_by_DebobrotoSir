import java.util.*;

public class O4_LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the year");
        int year = in.nextInt();
        if(year%400==0)
        {
            System.out.println("Leap year "+year);
        }
        else if(year%100==0)
        {
            System.out.println("not a leap year " +year);
        }
        else if(year%4==0)
        {
            System.out.println("Leap year "+year);
        }
        else {
            System.out.println("Not a leap year "+year);
        }
    }
}
