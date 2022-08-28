public class O6
{
    public static void main(String[] args)
    {
        bank1 obj = new bank1();
        System.out.println(obj.x); // output will be 10
        obj.meth();
    }
}
    class a  // superclass
    {
        int x = 10 ;
        void meth()
        {
            System.out.println("hi");
        }
    }
    class bank1 extends  a  // subclass , cause we are using the class a in this class
        // class a has more power
    {
        int x = 20;
        void meth()
        {
            System.out.println("Hello"); // function overriding
            //super.meth(); // ie we can use the superclass's
            System.out.println(super.x);
            System.out.println(x);
        }
    }

// extends a means that --
// inheritance
// ie in class bank it has also a class
// ie in this case the bank class has the contents of the a class
// just use simple examples - like only hi hello
// classes should be outside the public class

// what is the difference between the function overloading and over riding
//

// both function overriding and overloading are both polymorphism