public class O1 {
    public static void main(String[] args) {

        int x=10;
        System.out.println(x);
        meth(x); // this is call by value
        // after rece
        System.out.println(x);

    }
    // without the static you cant call an variable
    // you need object for accessing

    public static void meth(int x)
    {
        x=x+1;
    }
}
