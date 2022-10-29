public class O6 {
    public static void main(String[] args) {
        CD1 obj = new CD1(10,20);
        System.out.println();
        System.out.println(obj.x + "  "+obj.y);


    }
}
class AB1
{
    int x ;
    AB1(int xxx)
    {
        x=xxx;
        System.out.println("Inside AB1 Class");
    }
}


// whenever there is concept of inheritance
// SEC C from isc theory -- assignment

class CD1 extends AB1
{
    int y ;
    CD1(int xxx, int yyy)
    {
        super(xxx);
        y=yyy;
         // call to the super keyword must be the first statement
        // in the constructor
        System.out.println("Inside CD1 class");
        // super - var parent class var
        // super class version of that method
        // super normally - super class constructor


    }
}