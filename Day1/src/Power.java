import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st num ");
        int a = in.nextInt();
        int b = in.nextInt();
       double c = Math.pow(a,b);
        System.out.println(c);
        int d = (int)(Math.pow(a,b)); // type casting
        System.out.println(d);


    }
}
// why we use double in case of power
// as because the power can be in fractions
// 1.5
// so universally the math.max function returns double by default
