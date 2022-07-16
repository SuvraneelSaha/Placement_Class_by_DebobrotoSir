import java.util.Scanner;

public class O2 {
    // Basic Operations like sum , minus , divide and multiplication
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st number ");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("please enter a valid number ");
            in.next();

        }
        int a = in.nextInt();
        System.out.println("Please enter the 2nd number");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("please enter a valid number ");
            in.next();

        }
        int b = in.nextInt();
        System.out.println("please enter the number for OPERATION");
        int n = in.nextInt();
        switch (n)
        {
            case 1:
                System.out.printf("a+b = %d",a+b);
                break;
            case 2:
                if(a>b)
                {
                    System.out.printf("a-b = %d ",a-b);

                }
                else
                {
                    System.out.printf("b-a = %d ",b-a);
                }
                break;
            case 3:
                System.out.printf("a*b = %d ",a*b);
                break;
            case 4:
                if(a>b)
                {

                    System.out.printf("a / b = %d",a/b);
                }
                else
                {
                    System.out.printf("b / a = %d",b/a);
                }
                break;
            default:
                System.out.println("Wrong Input");
        }


    }
}
