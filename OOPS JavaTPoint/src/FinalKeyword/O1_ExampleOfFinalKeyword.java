package FinalKeyword;
/*
There is a final variable speedlimit,
 we are going to change the value of this variable,
  but It can't be changed because final variable once assigned a value can never be changed.


 */
public class O1_ExampleOfFinalKeyword {
    public static void main(String args[])
    {
        Bike9 obj=new  Bike9();
      // obj.speedlimit = 400 ;  //cannot assign a value to final variable speedlimit

    }
}
class Bike9 {
    final int speedlimit = 90;//final variable

    void run() {
        //speedlimit = 400; //  cannot assign a value to final variable speedlimit
    }
}
