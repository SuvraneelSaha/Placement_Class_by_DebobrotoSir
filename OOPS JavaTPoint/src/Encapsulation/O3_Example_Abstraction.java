package Encapsulation;

public class O3_Example_Abstraction {

    // in case of Encapsulation first set then get name

    public static void main(String[] args)
    {
        //creating instance of the encapsulated class
        Student s=new Student();
        //setting value in the name member
        s.setName("vijay");
        //getting value of the name member
        System.out.println(s.getName());
    }
}
 class Student{
    //private data member
    private String name;
    //getter method for name
    public String getName(){
        return name;
    }
    //setter method for name
    public void setName(String name){
        this.name=name;
    }
}

