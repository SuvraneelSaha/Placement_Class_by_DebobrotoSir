import java.util.Scanner;

public class O9_GradeSystem {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter the Marks");
        while (in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("NA Wrong Input");
            in.next();
        }
        int marks = in.nextInt();

        if(marks>80 && marks<=100)
        {
            System.out.println("A grade"+marks);
        }
        else if(marks>=60 && marks<=80)
        {
            System.out.println("B grade"+marks);
        }
        else if(marks>=40 && marks<60)
        {
            System.out.println("C Grade"+marks);
        }
        else if(marks<40 && marks>=0)
        {
            System.out.println("D Grade");
        }
        else
        {
            System.out.println("Invalid input ");
        }
    }
}
