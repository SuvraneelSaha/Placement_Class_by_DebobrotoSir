import java.util.Scanner;

public class O10_PassorFailOfaStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the marks of the student ");
        while(in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int marks = in.nextInt();

        if(marks>=35)
        {
            System.out.println("passed "+marks);
        }
        else
        {
            System.out.println("Failed " +marks);

        }
    }
}
