public class O8 {
    public static void main(String[] args)
    {
            // hackerrank java question of jump

    }

    public static boolean canWin(int leap,int[] game)
    {
        int max = 0;
        int count = 0 ;
        boolean cons = false;
        for(int i = 0 ; i<= game.length-1;i++)
        {
            if(game[i] == 1)
            {
                count++;
            }
            else
            {
                if(count>max)
                {
                    max = count;
                }
                count=0;
            }
        }
        if(max >= leap)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
