package Constructors;

public class ParameterizedConstructor {
    public static void main(String args[]) {
        //creating objects and passing values
        Student4 s1 = new Student4(111, "Karan");
        Student4 s2 = new Student4();
        s2.id = 55;
        s2.name = "Nigga";
        //calling method to display the values of object
        s1.display();
        s2.display();

    }
}

    class Student4 {
        int id;
        String name;

        //creating a parameterized constructor
        Student4(int i, String n)
        {
            id = i;
            name = n;
            // just for the naming convention use this.id = i ; just like these
        }
        Student4()
        {

        }

        //method to display the values
        void display() {
            System.out.println(id + " " + name);
        }

    }
