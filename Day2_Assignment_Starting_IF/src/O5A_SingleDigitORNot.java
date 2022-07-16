import java.util.Scanner;

public class O5A_SingleDigitORNot {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st number");
        while (in.hasNext("[a-z A-Z.]+"))
        {
            System.out.println("NA");
            in.next();
        }
        int a = in.nextInt();
        boolean isTwoDigit = Integer.toString(Math.abs(a)).length() >=2;
        // here we are using the Interger to string function
        // where we convert the user inputted integer into a string
        // we are actually taking the absolute value of that integer by using the Math.abs  function
        // so now we have taken the absolute value and also have converted it into a string
        // Then we are taking the length of the string (the int itself - but string as it has been converted to  string )
        // then we are checking that if the length of the string is >= 2

        if(isTwoDigit==true)
        {
            System.out.println("More than 1 digit");

        }
        else
        {
            System.out.println("single digit");
        }
    }
}
