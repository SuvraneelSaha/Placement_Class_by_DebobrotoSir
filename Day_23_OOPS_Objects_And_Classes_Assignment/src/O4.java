import java.util.Scanner;

public class O4 {
    // Library
    public static void main(String[] args) {
        Library1 obj = new Library1();
        obj.input();
        obj.compute();
        obj.display();

    }
}
class Library1
{
    int acc_num;
    String title;
    String author;

    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter yout account number ");
        acc_num = in.nextInt();
        System.out.println("Please enter the title of the Book:");
        title = in.nextLine(); // why its not taking any input
        title = in.nextLine();
        System.out.println("Please enter the name of the Author ");
        author = in.nextLine();

    }

    void compute()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of days the Book was rented : ");
        int days = in.nextInt();

        System.out.println("The price  of the fine is "+(2*days));


    }

    void display()
    {
        System.out.println("Account Number"+"\t"+"Title"+"\t"+"Author");
        System.out.printf("%d\t %s\t %s ",acc_num,title,author);
    }
}
