import java.util.Scanner;

public class CollegeAdmission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the physics marks :");
        int p = in.nextInt();
        System.out.println("enter the chemistry marks :");
        int c = in.nextInt();
        System.out.println("enter the maths marks :");
        int m = in.nextInt();

        if(p>=80)
        {
            // ?
            if(c>=80)
            {
                if(m>=80)
                {
                    System.out.println("yes");
                }
                else
                {
                    System.out.println("No");
                }
            }
            else
            {
                System.out.println("no");
            }
        }
        else
        {
            System.out.println("no");
        }

    }
}
// when combing logic we need to use the && operator
// ex if ( p >= 80 && c >= 80 )

// learning of python there is an advantage the syntax designing or
// alignment is necessary
// ie indentation is very important
// but in case of java there is presence of brackets so for this reason we dont need indentation

