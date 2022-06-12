import java.util.Scanner;

public class O11_PrintRemarksOnScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the marks");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int marks = in.nextInt();
        if(marks<0)
        {
            System.out.println("Invalid marks "+marks);
        }
        if(marks>100)
        {
            System.out.println("Invalid marks "+marks);
        }

        if(marks>90)
        {
            if(marks<=100)
            {
                System.out.println(" Too Good "+marks);
            }
        }
        else if(marks>=80)
        {
            if(marks<=90)
            {
                System.out.println("Good "+marks );
            }
        }
        else if(marks>20)
        {
            if(marks<80)
            {
                System.out.println("Average " +marks);
            }
        }
        else if(marks<=20)
        {
            if(marks>=10)
            {
                System.out.println("Bad "+marks);
            }
        }
        else if(marks<10)
        {
            if(marks>=0)
            {
                System.out.println("Too bad "+marks);
            }
        }
    }
}
