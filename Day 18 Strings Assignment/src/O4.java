import java.util.Scanner;
// count the number of letters
// ie 23 sd asda
// num of letters : 6
// total length = 10
public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int countLetter = 0 ;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if((ch>='A' && ch<='Z' )||(ch>='a' && ch<='z'))
            {
                countLetter++;
            }
        }
        System.out.println("Number of Letters is "+countLetter);
        System.out.println("Total length of the string is "+s.length());
    }
}
