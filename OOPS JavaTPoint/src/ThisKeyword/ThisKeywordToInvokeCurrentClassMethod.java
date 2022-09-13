package ThisKeyword;

public class ThisKeywordToInvokeCurrentClassMethod {
    public static void main(String args[]) {
        A a1 = new A();
        a1.n();
        new A().m(); // this is an abstract object
    }
}
class A
{
    void m()
    {
        System.out.println("hello migga");
    }
    void n()
    {
        System.out.println("hello nigga");
        //m(); same as this.m()
        this.m();
        /*
        what is happening is that there are two methods in this A class
         and in the method n() we are calling the m method by using this Keyword

         we can also use m() and the java compiler will automatically transform it to this.m();

         */
    }
}
