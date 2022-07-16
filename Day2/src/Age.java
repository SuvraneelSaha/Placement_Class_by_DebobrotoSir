import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the age :");
        int a = in.nextInt();
        if(a>=18)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("NA");
        }

    }
}
// programmers make their app so that they cant know from the perspective of a coder or a programmer
// IE it is abstraction -- ie to show simply the functionalities withour involving any complexities

