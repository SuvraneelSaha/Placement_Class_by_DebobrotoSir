public class O8 {
    public static void main(String[] args) {
        int x ;
        for (x = 5;  x>=1 ; x--)
        {
            for (int i = x; i >=1; i--)
            {
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
// 54321 -- first line
// 4321
// 321
// 21
// 1  -- last line

// initializer --
// 1 -- last line
// 5 -- first line

// Approach --
// 1st - biggest line
// 2nd -- find out how the first line and the last line
// is getting printed
// construct logic
//