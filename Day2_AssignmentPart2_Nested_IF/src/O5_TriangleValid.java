import java.util.Scanner;

public class O5_TriangleValid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("please enter the 1st angle");
        int an1 = in.nextInt();

        System.out.println("please enter the 2nd angle");
        int an2 = in.nextInt();

        System.out.println("please enter the 3rd angle");
        int an3 = in.nextInt();

        if(an1+an2> an3)
        {
            if(an1+an2+an3>180)
            {
                System.out.println("Not valid");
            }
            else if(an1+an2+an3==180)
            {
                System.out.println("Valid");
            }
        }
        else if (an2+an3>an1)
        {
            if(an1+an2+an3>180)
            {
                System.out.println("Not valid");
            }
            else if(an1+an2+an3==180)
            {
                System.out.println("Valid");
            }
        }
        else if(an3+an1>an2)
        {
            if(an1+an2+an3>180)
            {
                System.out.println("Not valid");
            }
            else if(an1+an2+an3==180)
            {
                System.out.println("Valid");
            }
        }
        else
        {
            System.out.println("NA");
        }




    }
}
