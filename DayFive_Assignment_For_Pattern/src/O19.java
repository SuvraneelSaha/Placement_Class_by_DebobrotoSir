public class O19 {
    public static void main(String[] args) {
        Pattern19(4);
    }
    public  static void Pattern19(int n)
    {

        for (int row = 0; row <n ; row++)
        {
            for (int col = 0; col <=row ; col++)
            {
                if((row+col)%2==0)
                {
                    System.out.print(1 + " ");
                }
                else
                {
                    System.out.print(0 + " ");
                }

            }
            System.out.println();
        }
    }
}
