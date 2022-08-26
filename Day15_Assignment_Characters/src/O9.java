import java.util.Scanner;

public class O9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the character");

        char n ='0';
        char res ='0';

        if(in.hasNext("[a-z]+"))
        {
            n = in.next().charAt(0);
            res = Character.toUpperCase(n);
        }
        else if(in.hasNext("[A-Z]+"))
        {
            n=in.next().charAt(0);
            res = Character.toLowerCase(n);

        }

        System.out.println("Result = "+res);



    }
}
