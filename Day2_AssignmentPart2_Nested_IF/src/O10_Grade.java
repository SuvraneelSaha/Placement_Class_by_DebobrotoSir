import java.util.Scanner;

public class O10_Grade {
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

        if(marks>80)
        {
            if(marks<=100)
            {
                System.out.println(" Grade A "+marks);
            }
        }
        else if(marks>=60)
        {
            if(marks<=80)
            {
                System.out.println("Grade B "+marks );
            }
        }
        else if(marks>=40)
        {
            if(marks<60)
            {
                System.out.println("Grade C " +marks);
            }
        }
        else if(marks<40)
        {
            if(marks>=0)
            {
                System.out.println("Grade D "+marks);
            }
        }
    }
}
// question
// is it okay that we need to use else statement at the end of an if else if ladder
// or we could just use the else if
// without using and ending else
