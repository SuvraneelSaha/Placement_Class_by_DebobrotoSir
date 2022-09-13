package FinalKeyword;
/*
Is final method inherited?
Yes, final method is inherited but you cannot override it. For Example:


 */
public class O4_FinalMethod_CanBeInherited_InA_NonFinalClass {
    public static void main(String args[]){
        new Honda4().run();
    }
// final method is inherited but you cannot override it.
    // ie we can use the method which is having final keyword
    // but we cant do overriding
    // and in the case of when the class is itself a final class
    // you cant inherit the final class


}
class Bike4
{
    final void run()
    {
        System.out.println("running...");
    }
}
class Honda4 extends Bike4
{

}