import java.util.Scanner;

public class CollegeAdmission1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the physics marks :");
        int p = in.nextInt();
        if(p>=80)
        {
            System.out.println("enter the chemistry marks :");
            int c = in.nextInt();
            if(c>=80)
            {
                System.out.println("enter the maths marks :");
                int m = in.nextInt();
                if(m>=0)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("no");
                }
            }
            else {
                System.out.println("no");
            }
        }
        else
        {
            System.out.println("no");
        }



    }

}
// facebook reminder -- sir's view on fb activities
// dont dare to use  && and || in these 2 chapters
