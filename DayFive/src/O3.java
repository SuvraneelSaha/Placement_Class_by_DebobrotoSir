public class O3 {
    public static void main(String[] args) {

      int i,x;
      for (x=1;x<=5;x++)
      {
          for (i=5;i>=x;i--)
          {
              System.out.print(i);

          }
          System.out.println();

      }

    }
}
// appraoch from the biggest line
/*
54321
5432
543
54
5
 */

//  condition ->  x = 1  -- first line
//                x = 2 -- second line
// ...
//                x= 5 -- last line