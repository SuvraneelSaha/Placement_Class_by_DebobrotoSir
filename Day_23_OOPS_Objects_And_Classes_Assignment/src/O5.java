import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {

    MovieMagic obj = new MovieMagic();
    obj.accept();
    obj.display();

    }
}
// Movie Magic Question
class MovieMagic
{
    int year;
    String title;
    float rating;


    MovieMagic()
    {
        System.out.println("A new Object has been created ");
        year = 0 ;
        title ="";
        rating = 0 ;

    }
    void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the Movie Name :");
        title = in.nextLine();
        System.out.println("Please enter the Year when the movie was released ");
        year = in.nextInt();
        System.out.println("Please enter your Ratings:");
        rating = in.nextFloat();

    }

    void display()
    {
        if(rating>=0 && rating<=2)
        {
            System.out.println("Flop");
        }
        else if(rating>2 && rating<3.5)
        {
            System.out.println("Semi Hit");
        }
        else if(rating>=3.5 && rating<=4.5)
        {
            System.out.println("Hit");
        }
        else if(rating>4.5 && rating<=5)
        {
            System.out.println("Super Hit");
        }
        else
        {
            System.out.println("Out of Range Error ");
        }
    }
}