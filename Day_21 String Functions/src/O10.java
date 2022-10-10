import java.util.Scanner;

public class O10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Her_Decision = 0 ;

        while(true)
        {
            System.out.println("Would you like to go out with me in this Durga Pujo?");
            System.out.println();
            System.out.println("Enter YES or NO");
            String word = in.nextLine();
            if(word.equals("YES"))
            {
                Her_Decision = 1 ;
                break;
            }
            else
            {
                System.out.println("Cheems is Sed Try Again :))");
            }

        }

        if(Her_Decision == 1)
        {
            System.out.println("See you on soptami ");
            System.out.println("Wear a nice Dress ");
        }



    }
}
