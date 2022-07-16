import java.util.Scanner;

public class O13B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the wall length");
        int h = in.nextInt();
        System.out.println("please enter the count of 1m bricks");
        int a = in.nextInt();
        System.out.println("please enter the count of 5m bricks");
        int b = in.nextInt();

        // ex - dry run 19 len
        // 5m - 3 1m - 3

        //ex -dry run 2
        // len - 23
        // 5m - 5 ; 1m - 5
        //1st condition if 1m bricks = 0
        if(a==0)
        {
            if(h/5<=b)
            {
                System.out.println("Possible");
            }
        }
        // 2nd condition if 5m bricks = 0
        else if(b==0)
        {
            if(h<=a)
            {
                System.out.println("Possible0");
            }
        }
        // 3rd condition if thw wall length is divisible by 5 and the remainder remains
        // and the rem is <= a ie 1m bricks then possible
        // else modified
        else if((h/5)<=b && (h%5)<=a)
        {
            System.out.println("Possible1");
        }
        else
        {
            System.out.println("Impossible1");
        }
        // condition  - if h/5 > b ie no. of 5m bricks
        // h%5 <= a then possible
        // else not
//        if((h/5) > b )
//        {
//            if(h%5<=a)
//            {
//                System.out.println("Possible2");
//            }
//            else
//            {
//                System.out.println("Impossible2");
//            }
//        }
        //
        //else
         if((h%5)>a )
        {
            if(h/5<=b)
            {
                System.out.println("Possible3 ");
            }
            else
            {
                System.out.println("Impossible3");
            }
        }






    }
}
