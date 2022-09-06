public class O7 {
    public static void main(String[] args) {
        // what is the use of final
       final int x = 10 ;
        //x++;
        System.out.println(x);
        // final means constant
    }
}
class a1  // superclass
{

}
class bank2 extends  a1  // subclass , cause we are using the class a in this class
        // class a has more power
{
   final void meth() // overriding protected
   {
       System.out.println("hello");
   }
}
