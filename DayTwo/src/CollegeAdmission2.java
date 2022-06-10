import java.util.Scanner;

public class CollegeAdmission2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the physics marks :");
        int p = in.nextInt();
        if(p>=95)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("enter the chemistry marks :");
            int c = in.nextInt();
            if(c>=95)
            {
                System.out.println("yes");
            }
            else {
                System.out.println("enter the maths marks :");
                int m = in.nextInt();
                if(m>=95)
                {
                    System.out.println("yes");
                }
                else
                {
                    System.out.println("no");
                }
            }
        }


    }
}
// reminder - if else statements
// nested if else
// has no disadvantages
// but in case of else if there are some disadvantages
// but as a conclusion there is no difference
// but in case of situations
// nested if supremacy
