import java.util.Scanner;

public class O6_TypeOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("please enter the 1st side");
        int an1 = in.nextInt();

        System.out.println("please enter the 2nd side");
        int an2 = in.nextInt();

        System.out.println("please enter the 3rd side");
        int an3 = in.nextInt();

        if(an1==an2)
        {
            if(an1==an3)
            {
                System.out.println("Equalateral triangle "+an1+an2+an3);
            }
            if(an1!=an3)
            {
                System.out.println("isosceles triangle");
            }
        }
        else if(an1!=an2)
        {
            if(an3!=an2)
            {
                if(an1!=an3)
                {
                    System.out.println("Scalene triangle");
                }
            }
        }
    }
}
// wrong 
// edge case error 
