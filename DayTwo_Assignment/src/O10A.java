import java.util.Scanner;

public class O10A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the marks of the student ");
        while(in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int marks = in.nextInt();

        if(marks>=45 && marks<=100)
        {
            System.out.println("passed "+marks);
        }
        else if(marks<45 || marks >100)
        {
            System.out.println("Failed "+marks);
        }
    }
}
//
