public class O7 {
    public static void main(String[] args) {
        int x;
        for (x=7;x>=1;x--)
        {
            for (int i = 7; i >=x ; i--)
            {
                System.out.print(i);
            }
            System.out.println();

        }


    }
}
//7  -- first line
//76
//765
//7654
//76543
// 765432
// 7654321 -- last line

// 1 - last line -- condition ie x = 1  here the line is 7654321
//
// ....
// 7 - first line -- condition ie x = 7 here the line is 7

