import java.util.Scanner;

public class O6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the character");
        char n = in.next().charAt(0);

        System.out.println("Ascii "+(int)n);


        if(n>='A' && n<='Z')
        {
            System.out.println(n+"is a Uppercase Letter");
        }
        else if(n>='a' && n<='z')
        {
            System.out.println(n+"It is a lower case Letter");
        }
        // when we are taking input as a character
        // and we want to check whether the character is a number or not - single digit number or not
        // then we need to compare it with its ascii values
        // otherwise it will give errors - logical errors
       else if(n>=48 && n<=57)
        {
            System.out.println(n+"is a digit");
        }
       else
        {
            System.out.println(n+"is a symbol");
        }
    }
}

/*
    to be more clear -
        you cannot directly compare a number ie int with with int if the input is being taken as a character
        as it will compare the two values using ascii values
        we are comparing the character using the type casting
        ex - 1 its ascii value is 49
        if we take 1 as an character input
        it will be taken as 49 ascii value

        so when comparing
        say
        if(a>=0 && a<=9)
        it will always be false as a is 49
        1's ascii value
 */
