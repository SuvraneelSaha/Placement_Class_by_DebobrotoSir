public class O3 {
    public static void main(String[] args) {
        def1 obj = new def1();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.meth();
        obj.meth2();


        System.out.println("overriding");
        System.out.println(obj.x);
        // pen e kichu likhli then moneholo bhul likhechis
        // katakuti kore letter tar oporei likhlam
        // overriding



        // OOPS is too important ; for lifetime


    }
}
class abc
{
    int x = 10 ;
    // class may contain constructor variables and functions ;
    void meth()
    {
        System.out.println("HI "+x);
    }


}
class def1 extends abc
{
    int x = 20;
    int y = 50 ;
    void meth2()
    {
        System.out.println("Hello "+y);

    }
}