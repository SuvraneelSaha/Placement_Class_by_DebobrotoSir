package InstanceInitializerBlock;
/*
What is invoked first, instance initializer block or constructor?

In the above example,
it seems that instance initializer block is firstly invoked but NO.
 Instance intializer block is invoked at the time of object creation.
  The java compiler copies the instance initializer block in the constructor after the first statement super().
   So firstly, constructor is invoked. Let's understand it by the figure given below:
 */
public class O2_WhichISInvokedFirst {
    public static void main(String args[]){
        Bike8 b1=new Bike8();

    }
}
class Bike8 {
    int speed;

    Bike8()
    {
        System.out.println("constructor is invoked");
    }

    {
        System.out.println("instance initializer block invoked");
    }
}
