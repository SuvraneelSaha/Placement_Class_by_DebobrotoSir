package StaticKeyword;
/*
Important Points :
The static method can not use non static data member or call non-static method directly.
ie simple primtive data types or else we could say that we cant use variables when are not static in nature
in static methods
similarly we cannot use non static methods in a static method

this and super cannot be used in static context.
 */

public class RestrictionOfStaticMethod {
    public static void main(String args[]){
       // System.out.println(A.a);
    }
}
class A
{
    int a = 40;//non static
}

