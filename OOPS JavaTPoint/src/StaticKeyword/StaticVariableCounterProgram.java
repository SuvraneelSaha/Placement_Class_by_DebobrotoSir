package StaticKeyword;
////Java Program to illustrate the use of static variable which
////is shared with all objects.


/*
Important
As we have mentioned above,
 static variable will get the memory only once,
  if any object changes the value of the static variable, it will retain its value.
 */
public class StaticVariableCounterProgram {
    public static void main(String args[]){
//creating objects
        Counter2 c1=new Counter2();
        Counter2 c2=new Counter2();
        Counter2 c3=new Counter2();
    }
}
class Counter2 {
    static int count = 0;//will get memory only once and retain its value

    Counter2() {
        count++;//incrementing the value of static variable
        System.out.println(count);
    }
}