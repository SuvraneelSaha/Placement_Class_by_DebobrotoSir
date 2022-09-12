package ObjectsAndClasses;

class Calculation
{
    void fact(int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }

        System.out.println("factorial is " + fact);
    }
}

    public class AnonymousObject
    {
        public static void main(String[] args) {

            new Calculation().fact(5);//calling method with anonymous object
            // Way to create an Anonymous Object

            Calculation c1 =  new Calculation();
            c1.fact(4);
            // Way to create an object using a ref variable


        }
    }


