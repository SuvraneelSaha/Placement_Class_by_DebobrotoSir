public class O5 {
    public static void main(String[] args) {
        int x;
        for (x=1;x<=6;x++)
        {
            for (int i = 6; i >=x ; i--)
            {
                System.out.print(i);
            }
            System.out.println();

        }

    }
}
// 1 -- >

// 654321
// 65432
// 6543
// 654
// 65
// 6

// if x = 1 --> first line ie 654321
// if x  6 --> last line ie 6
