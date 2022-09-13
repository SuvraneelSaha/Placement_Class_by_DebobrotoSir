package Polymorphism_Runtime_And_CompileTime;

public class Is_Runtime_PolyMorphism_Takes_Place_In_Data_Members {
    /*
    A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.

In the example given below,
 both the classes have a data member speedlimit.
  We are accessing the data member by the reference variable of Parent class
   which refers to the subclass object.
    Since we are accessing the data member which is not overridden,
    hence it will access the data member of the Parent class always.

     */
    public static void main(String args[]) {
        Bike3 obj = new Honda3(); // upcasting
        // Runtime Polymorphism does not takes place in case of Instance Variables
        // they only take place in case of
        System.out.println(obj.speedlimit);//90


        Honda3 obj1 = new Honda3(); // without upcasting
        System.out.println(obj1.speedlimit);
    }


}
class Bike3{
    int speedlimit=90;
}
class Honda3 extends Bike3 {
    int speedlimit = 150;
}