public class O10 {
    public static void main(String[] args) {
        Pattern10(4);
    }
    static void Pattern10(int n)
    {
        for (int row = n; row >=1 ; row--)
        {
            for (int col = n; col >=row ; col--)
            {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
