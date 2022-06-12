import java.util.Scanner;

public class O9_MonthSeason {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the month number");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int month_num = in.nextInt();

        if(month_num==1)
        {
            System.out.println("winter season"+month_num);
        }
        else if(month_num==2)
        {
            System.out.println("winter season"+month_num);
        }
        else if(month_num==12)
        {
            System.out.println("winter season"+month_num);
        }
        else if(month_num==3)
        {
            System.out.println("Summer Seson"+month_num);
        }
        else if(month_num==4)
        {
            System.out.println("Summer Seson"+month_num);
        }
        else if(month_num==5)
        {
            System.out.println("Summer Seson"+month_num);
        }
        else if(month_num==6)
        {
            System.out.println("Monsoon Season "+month_num);
        }
        else if(month_num==7)
        {
            System.out.println("Monsoon Season "+month_num);
        }
        else if(month_num==8)
        {
            System.out.println("Monsoon Season "+month_num);
        }
        else if(month_num==9)
        {
            System.out.println("Autumn Season "+month_num);
        }
        else if(month_num==10)
        {
            System.out.println("Autumn Season "+month_num);
        }
        else if(month_num==11)
        {
            System.out.println("Autumn Season "+month_num);
        }
        else {
            System.out.println("Invalid number "+month_num);
        }




    }
}
