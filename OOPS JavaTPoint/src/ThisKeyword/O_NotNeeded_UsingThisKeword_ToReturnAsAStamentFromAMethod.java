package ThisKeyword;
// not Needed
public class O_NotNeeded_UsingThisKeword_ToReturnAsAStamentFromAMethod {
    public static void main(String args[]) {
        new A10().getA10().msg();
    }
}
 class A10
{
    A10 getA10()
    {
        return this; // here the object is being passed or returned
    }
    void msg(){
        System.out.println("Hello java");
    }
}

