public class O12 {
    public static void main(String[] args) {
        Pattern12(4);
    }
    static void Pattern12(int n)
    {
        for (int row = n; row >=1 ; row--)
        {
            for (int col = 1; col <=row ; col++)
            {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
