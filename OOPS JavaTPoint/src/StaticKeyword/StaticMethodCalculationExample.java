package StaticKeyword;

public class StaticMethodCalculationExample {
    public static void main(String args[]){
        // here see im not creating any Object of the Calcualte class
        // but im accessing the Method Cube which is present inside the Calculate Class

        int result=Calculate.cube(5);
        System.out.println(result);
    }
}
class Calculate
{
    static int cube(int x) {
        return x * x * x;
    }
}
