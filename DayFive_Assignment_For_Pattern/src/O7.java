public class O7 {
    public static void main(String[] args) {
        Pattern7(4);
    }
    public static void Pattern7(int n)
    {
        for (int row = n; row >=1 ; row--)
        {
            for (int col = 1; col <= row ; col++)
            {
                System.out.print(col + " ");

            }
            System.out.println();

        }
    }
}
