public class O9 {
    public static void main(String[] args) {
        int i ,x;
        for ( x =1; x <=6 ; x++) // for the number of rows that are present
        {
            for(i=1;i<x;i++) // for spacing
                // and in this case the spacing is getting increased
                // so for(i=1;i<=x;i++) -- > the spacing is getting increased after each iteration
            {
                System.out.print(" ");
            }
            for ( i=x; i <=6 ; i++)  // for printing the number or symbol
                // here the stars are getting decreased in each iteration
                // so for(i=x ; x<=6 or number ; i++)
                // the initializer will change according to the the x
                // as inside the for loop the i's value is not changing

            {
                System.out.print("* ");
            }
            System.out.println(); // for getting into the new line
        }

    }
}
// ******
//  *****
//   ****
//    ***
//     **
//      *
// 6- first line
// 1 -- last line

// same logic -- as that from the previous

// FOR SPACING
// rule 1 :  x=1 to n is the number of lines
// rule 2 : increasing i=1 to x
     //       decreasing i=x to n