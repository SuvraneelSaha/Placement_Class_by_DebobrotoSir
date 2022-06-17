import java.util.Scanner;

public class O13_BrickCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the count of 1m bricks");
        while (in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("NA : enter a number");
            in.next();
        }
        int brick_1m = in.nextInt();
        System.out.println("Please enter the count of 5m bricks");
        while (in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("NA : enter a number");
            in.next();
        }
        int brick_5m = in.nextInt();

        System.out.println("Please enter the length of the wall ");
        while (in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("NA : enter a number");
            in.next();
        }
        int wall = in.nextInt();

        if(brick_5m > (wall/5) && (brick_1m>wall%5))
        // 4      > 3   && 5 > 4
        {
            System.out.println("possible");
        }
        else if (brick_5m < (wall/5) || (brick_1m<wall%5))
                 //   2     <  20/5=4 || 5 <0
        {
            System.out.println("Impossible");
        }
        else if(brick_1m> wall || brick_5m>wall/5)
        //      5 > 9          || 5 > 1
        {
            System.out.println("Possible 1");
        }
        else if(brick_1m <  wall &&  brick_5m < wall/5)
        {
            System.out.println("Impossible1");
        }

//        if(brick_1m ==0)
//        {
//            if(brick_5m>0)
//            {
//
//                if(wall/5<=brick_5m)
//                {
//                    System.out.println("Possible1");
//
//                }
//                else
//                {
//                    System.out.println("Impossible");
//                }
//
//
//            }
//            else
//            {
//                System.out.println("Impossible1");
//            }
//        }
//
//        if(brick_5m==0)
//        {
//            if(brick_1m>0)
//            {
//                if(brick_1m>wall)
//                {
//                    System.out.println("Possible2");
//                }
//            }
//            else
//            {
//                System.out.println("Impossible2");
//            }
//        }

        // to much complex thinking and approach needs to change ASAP
        // think simple , just minimum work
        // dont be egoistic




    }

}

// ex - 19
// count of 5 - 4
// count of 1 - 5
// 19%5 = 4
// 19/5 = 3
// 3>4 in case of 5m brick -- ok
// 19%5 = 4
// 4%1 = 4
// if(count of 1<4%1) --> false
// else
// true