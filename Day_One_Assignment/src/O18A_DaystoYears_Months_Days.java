import java.util.Scanner;

public class O18A_DaystoYears_Months_Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the total no. of days  ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int time = in.nextInt();
    }
}
