import java.util.Scanner;

public class O4 {
    // No of days in specific Months
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Month number ");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("please enter a valid number ");
            in.next();

        }
        int n = in.nextInt();
        switch (n)
        {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("31 Days Month"+n);
                break;
            case 2 :
                System.out.println("either 28 or 29 days depending upon the Year Month"+n );
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days Month"+n);
                break;

            default:
                System.out.println("Invalid Month Number");


        }


    }
}
