public class O6 {
    public static void main(String[] args) {
        Pattern6(4);
    }
    public static void Pattern6(int n)
    {
        for (int row = 1; row <=n ; row++)
        {

            for (int col = n; col >=row ; col--)
            // if certain things are off then it will go in an infinite loop
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
