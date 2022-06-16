import java.util.Scanner;

public class O10_Marks {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter the Marks");
        while (in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("NA Wrong Input");
            in.next();
        }
        int marks = in.nextInt();
        if(marks>90 && marks<=100)
        {
            System.out.println("Too Good "+marks);
        }
        else if(marks>=80 && marks<=90)
        {
            System.out.println("Good "+marks);
        }
        else if(marks>=10 && marks<=20)
        {
            System.out.println("Bad "+marks);
        }
        else if(marks>20 && marks<80)
        {
            System.out.println("Average "+marks);
        }
        else if(marks<10)
        {
            System.out.println("Too Bad "+marks);
        }
        else
        {
            System.out.println("Invalid Input "+marks);
        }
    }
}
