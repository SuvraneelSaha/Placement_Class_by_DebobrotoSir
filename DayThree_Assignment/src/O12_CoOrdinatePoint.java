import java.util.Scanner;

public class O12_CoOrdinatePoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st Co ordinate point");
        while (in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("NA : enter a number");
            in.next();
        }
        int x = in.nextInt();
        System.out.println("Please enter the 2nd Co ordinate point");
        while (in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("NA : enter a number");
            in.next();
        }
        int y = in.nextInt();

        if(x>=0 && y>=0)
        {
            System.out.printf("1st Quadrant x=%d y=%d",x,y);
        }
        else if(x<=0 && y>=0)
        {
            System.out.printf("2nd Quadrant x=%d y=%d",x,y);
        }
        else if(x<=0 && y<=0)
        {
            System.out.printf("3rd Quadrant x=%d y=%d",x,y);
        }
        else if(x>=0 && y<=0)
        {
            System.out.printf("4th Quadrant x=%d y=%d",x,y);
        }
        else if(x==0 && y==0)
        {
            System.out.printf("Center x=%d y=%d",x,y);
        }

    }
}
