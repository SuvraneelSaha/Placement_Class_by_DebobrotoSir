public class O29 {
    public static void main(String[] args) {

        int a = 0 ;
        for (int i = 1; i <=5 ; i++)
        {
            a = 10*a+i;
            System.out.print(a + " ");
            // the logic behind this is that
            // the initial value of a is 0
            // 1st
            // a = 10 * 0 + i = 0 + 1 = 1
            // 2nd
            // a = 10*1 + i = 10 + 2 = 12
            // 3rd
            // a = 10 * 12 + i = 120 + 3 = 123
            // 4th
            // a = 10 *123 + i = 1230 + 4 = 1234
            // 5th
            // a = 10 * 1234  + i = 12340 + 5 = 12345



        }
    }
}
// 1 12 123 1234
