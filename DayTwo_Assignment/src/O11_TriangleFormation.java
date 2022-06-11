import java.util.Scanner;

public class O11_TriangleFormation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st angle ");
        while(in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int an1 = in.nextInt();

        System.out.println("please enter the 2nd angle ");
        while(in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int an2 = in.nextInt();

        System.out.println("please enter the 3rd angle ");
        while(in.hasNext("[a-z A-z]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int an3 = in.nextInt();


        if(an1+an2+an3==180)
        {
            System.out.println("Triangle formation possible "+an1+an2+an3);
        }
        else
        {
            System.out.println("Triangle formation NOT possible "+an1+" " +an2 + " "+an3);
        }
    }
}
