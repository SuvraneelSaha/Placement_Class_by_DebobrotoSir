import java.util.Scanner;

public class O7_Acute_Obtuse_RrightAngled {
    public static void main(String[] args) {
        // based on degrees
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 3 Degrees");
        while (in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("Wrong input ; Enter a number");
            in.next();
        }
        int a = in.nextInt();
        while (in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("Wrong input ; Enter a number");
            in.next();
        }
        int b = in.nextInt();
        while (in.hasNext("[a-z A-Z]+"))
        {
            System.out.println("Wrong input ; Enter a number");
            in.next();
        }
        int c = in.nextInt();
        // input done

        // condition checking
        if((a>=180||b>=180||c>=180))
        {
            System.out.println("Invalid Degree of the angle Bigger");
        }
        // condition checking
         if (a<=0||b<=0||c<=0)
        {
            System.out.println("Invalid Degree of the angle Lesser");
        }

         if(a+b+c==180)
         {
             if(a<90 && b<90 && c<90)
             {
                 System.out.println("Acute Angled Triangle");
             }
             else if (a==90||b==90||c==90)
             {
                 System.out.println("Right angled Triangle");
             }
             else if(a>90||b>90||c>90)
             {
                 System.out.println("Obtuse Angled Triangle");
             }
         }
         else
         {
             System.out.println("NA not valid ");
         }




    }
}
// first check if the sum of 3 is 180 or not
// we can use functions separately to find out whether the triangle is valid or not
// ie ie any angle is > 180 or not and if angle <0
// and another function for finding what type of trinagle it is based upon the angle