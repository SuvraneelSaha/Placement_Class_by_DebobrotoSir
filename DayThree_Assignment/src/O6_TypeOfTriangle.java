import java.util.Scanner;

public class O6_TypeOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("please enter the 1st side");
//        int a = in.nextInt();
//        System.out.println("please enter the 2nd side");
//        int b = in.nextInt();
//        System.out.println("please enter the 3rd side");
//        int c = in.nextInt();
//
//       if(a==b) // 10 10
//       {
//           if(b==c) // 10
//           {
//               System.out.println("Equilateral triangle");
//           }
//       }
//       else if(a>b) //10 8
//       {
//           if(a!=c && b==c) // 10!8 && 8==8
//           {
//               System.out.println("Isosceles triangle");
//           }
//       }
//       else if(b>c) //10 8
//       {
//           if(b!=a && a==c) // 10!8 && 8==8
//           {
//               System.out.println("Isosceles triangle");
//           }
//       }
//       else if(c>a) //10 8
//       {
//           if(c!=b && a==b) // 10!8 && 8==8
//           {
//               System.out.println("Isosceles triangle");
//           }

        System.out.println("please enter the 1st side");
        int an1 = in.nextInt();

        System.out.println("please enter the 2nd side");
        int an2 = in.nextInt();

        System.out.println("please enter the 3rd side");
        int an3 = in.nextInt();

        // equi condition
        if(an1==an2)
        {
            if(an1==an3)
            {
                System.out.println("Equalateral triangle "+an1+an2+an3);
            }

        }
        //isosceles condition
         if(an1>an2 || an1<an2) // 10 12 10
            // 12 10 10
        {
            if(an2==an3)
            {
                System.out.println("isosceles triangle");

            }
            else if(an1==an3)
            {
                System.out.println("isosceles triangle");
            }

        }
        else if(an1!=an2)
        {
            if(an2!=an3)
            {
                if(an1!=an3)
                {
                    System.out.println("Scalene triangle");
                }
            }
        }

        else
        {
            System.out.println("Invalid");
        }

    // very wrong approach
        // need to think clearly
        // take a break



    }

}
