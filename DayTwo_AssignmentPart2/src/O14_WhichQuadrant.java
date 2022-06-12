import java.util.Scanner;

public class O14_WhichQuadrant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st point");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int x1 = in.nextInt();
        System.out.println("Please enter the 2nd point");
        while (in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int y1 = in.nextInt();

        if(x1==0)
        {
            if(y1==0)
            {
                System.out.println("Center "+x1+y1);
            }
        }
        else if(x1>0)
        {
            if(y1>0)
            {
                System.out.println("1st quadrant "+x1+y1);
            }
            else
            {
                System.out.println("4Th quadrant "+x1+y1);
            }
        }
        else if(x1<0)
        {
            if(y1>0)
            {
                System.out.println("2nd Quadrant "+x1+y1);
            }
            else
            {
                System.out.println("3rd Quadrant "+x1+y1);
            }
        }

    }
}
// -1 -1 --> 3rd
//  + 1 , -1 --> 4th
// -1 , +2 --> 2nd
// + 1 + 1 -->  1st
