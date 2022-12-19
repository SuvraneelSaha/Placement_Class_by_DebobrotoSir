public class O3 {
    int x = 10 ;
    void meth(O3 o)
    {
        o.x = x + 1;

    }
    public static void main(String[] args) {
        O3 obj = new O3();
        System.out.println(obj.x);
        obj.meth(obj);
        System.out.println(obj.x);

    }
}
// kunal oops playlist
