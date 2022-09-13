package SuperKeyword;

public class O6_Super_Example_RealUse {
    public static void main(String[] args) {
        Res e1 = new Res(1, "ankit", 45000f);
        e1.display();
    }

    }
class Person
{
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Emp extends Person
{
    float salary;
    Emp(int id,String name,float salary){
        super(id,name);//reusing parent constructor for the two passed parameters ie the name and the ID
        this.salary=salary;
    }
    //void display(){System.out.println(id+" "+name+" "+salary);}
}
class Res extends Emp
{
    Res(int id,String name,float salary)
    {
        super(id,name,salary);

    }
    void display(){System.out.println(id+" "+name+" "+salary);}
}
