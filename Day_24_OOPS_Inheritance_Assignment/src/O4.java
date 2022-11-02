public class O4 {
    public static void main(String[] args) {
    Series obj = new Series(5);
    //obj.CalculateSum();
    obj.Display();
    }
}
// Factorial Question
class Number
{
    int n ;

    Number(int n)
    {
        this.n = n;
    }
    Number()
    {

    }

    int Factorial(int n)
    {
        int fact = 1 ;
        for (int i = 1; i <= n; i++)
        {
            fact = fact * i ;

        }
        return fact;
    }

    void Display()
    {
        System.out.println("The Number is "+n);
        System.out.println("The Factorial of the Number is "+Factorial(this.n));
    }
}
class Series extends Number
{
    int sum ;

    Series(int nn)
    {
        super(nn);
    }

    void CalculateSum()
    {
        for (int i = 1; i <=super.n; i++)
        {
            sum = sum + Factorial(i);
        }

        System.out.println("The sum of The Series is "+sum);

    }


    void Display()
    {
        System.out.println("The Number is "+super.n);
        System.out.println("The Factorial of the Number is "+Factorial(super.n));
        CalculateSum();

    }



}