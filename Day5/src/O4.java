public class O4 {
    public static void main(String[] args) {
        int x;
        for(x=1;x<=6;x++)
        {
            for (int i = 1; i <=x ; i++)
            {
                System.out.print(i);
            }
            System.out.println();

        }

    }
}
// 1
// 12
// 123
// 1234
// 12345
// 123456
// 1- first line --> 1
// 2 - second line --> 12
// 3 - third line  --> 123
// ...
// 6 -last line