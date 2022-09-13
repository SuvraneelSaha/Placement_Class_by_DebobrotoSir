package ThisKeyword;

public class ThisKeyword_ToPassArguments_InMethods {
    public static void main(String args[])
    {
        S2 c1 = new S2();
        c1.p();
    }
}
class S2 {
    void m(S2 obj)
    {
        System.out.println("method is invoked");
    }

    void p()
    {
        m(this);
        // this. m(this); we wont get any errors if we do this

    }
}

