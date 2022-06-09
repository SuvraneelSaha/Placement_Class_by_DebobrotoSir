import java.util.Scanner;

public class O7_Hours_Minutes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the hour");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();
        System.out.println("please enter the minute");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int b = in.nextInt();
        int min = a * 60 ;
        min+=b;
        System.out.println("Total minutes = "+min);

    }
}
