package FinalKeyword;

public class UnInitialized_Final_Var {
    /*
    A final variable that is not initialized at the time
     of declaration is known as blank final variable.

If you want to create a variable that is initialized at the time of creating object
 and once initialized may not be changed,
  it is useful. For example PAN CARD number of an employee.

It can be initialized only in constructor.
     */


    public static void main(String[] args) {
        Student obj = new Student(11,"Nigga","OJH738");
        obj.display();
        Student obj2 = new Student(12,"Wigga","Wigga3231");
        obj2.display();

    }
/*
If you want to create a variable that is initialized
 at the time of creating object and once initialized may not be changed, it is useful.
 */

}

class Student{
    int id;
    String name;
    final String PAN_CARD_NUMBER;

    Student(int id,String name,String PAN_CARD_NUMBER)
    {
        this.id = id;
        this.name = name;
        this.PAN_CARD_NUMBER=PAN_CARD_NUMBER;
    }

    void display()
    {
        System.out.println(id + " " + name + " " + PAN_CARD_NUMBER);
    }
}
