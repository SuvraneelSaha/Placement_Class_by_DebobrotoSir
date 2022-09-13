package Aggregation;

public class Aggregation_Example {
    public static void main(String args[]){
        Circle c=new Circle();
        double result=c.area(5);
        System.out.println(result);
    }

}
class Operation
{
    int square(int n)
    {
        return n*n;
    }
}
class Circle
{
    Operation op;//aggregation  // declaration
    double pi = 3.14;

    double area(int radius)
    {
        op = new Operation(); // initialization
        int rsquare = op.square(radius);//code reusability (i.e. delegates the method call).
        return pi * rsquare;
    }
}