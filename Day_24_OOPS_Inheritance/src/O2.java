public class O2 {
    public static void main(String[] args) {
        ABC obj = new ABC();
        System.out.println(obj.x);
        obj.meth();


        def obj1 = new def();
        System.out.println(obj1.x);
        // if there is no inheritance
        // error as it has no values or
        // vars inside of it

        obj1.meth();




    }

}
// inheritance

class ABC
{
    int x = 10 ;
    // classes may contain constructor variables and functions ;
    void meth()
    {
        System.out.println("HI "+x);
    }


}
class def extends ABC
{

}
