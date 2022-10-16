

public class O17Pattern {
    public static void main(String[] args) {
        Pattern3(5);


    }
    public static void Pattern1(int n)
    {
        for (int j = 1; j <=n ; j++)
        {
            for (int i = 1; i <= j; i++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void Pattern2(int n)
    {
        for (int j = 1; j <=n ; j++)
        {
            for (int i = 1; i <= j; i++)
            {
                System.out.print(" # ");
            }
            System.out.println();
        }
    }
    public static void Pattern3(int n)
    {
        for (int j = 1; j <=n ; j++)
        {
            for (int i = 1; i <= j; i++)
            {
                System.out.print(" $ ");
            }
            System.out.println();
        }
    }

}
