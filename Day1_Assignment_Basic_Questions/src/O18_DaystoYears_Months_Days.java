import java.util.Scanner;

public class O18_DaystoYears_Months_Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the total no. of days  ");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
      int time = in.nextInt();

        int[] division = {365,30,1};

        for (int i = 0; i <3 ; i++)
        {
            System.out.printf("Divisions = %d",time/division[i]);
            time = time%division[i];
        }


// Lets give another try the i/p and o/p doesnt seems right


    }

}
