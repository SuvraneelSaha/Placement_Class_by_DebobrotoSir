public class O16 {
    public static void main(String[] args) {
        Pattern15(4);


    }
    static void Pattern15(int n)
    {
        int k = 9 ;
        for (int row = 1; row <=n ; row++)
        {
            for (int col = 1; col <=row ; col++)
            {
                System.out.print(k + " ");
                k--;
            }
            System.out.println();
        }
    }
}
