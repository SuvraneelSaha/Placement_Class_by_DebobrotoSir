package BASIC;
// F printing
public class O3 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
        {
            System.out.print("#");
        }
        System.out.println();
        for (int i = 0; i < 6; i++)
        {
            if(i==2)
            {
                for (int j = 0 ; j<4;j++)
                {
                    System.out.print("#");
                }
            }
            System.out.println("#");
        }

    }
}
