public class O20 {
    public static void main(String[] args) {
        Pattern20(4);
    }
    static void Pattern20(int n)
    {
        for (int row = 0; row <n ; row++)
        {
            for (int col = 0; col <=row ; col++)
            {
                if((row+col)%2==0)
                {
                    System.out.print(0 + " ");
                }
                else
                {
                    System.out.print(1 + " ");
                }

            }
            System.out.println();
        }
    }
}
