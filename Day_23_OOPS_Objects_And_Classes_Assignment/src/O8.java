public class O8 {
    // Student Class
    public static void main(String[] args) {

        Student obj = new Student("Nigga Cahan" , 19, 88.7,89.76,98.4);

        obj.compute();
        obj.display();


    }
}
class Student
{
    String name ;
    int age;
    double m1,m2,m3;
    double average;
    double max ;


    Student(String name,int age,double m1,double m2 , double m3)
    {
        this.name = name;
        this.age = age;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;

    }

    void compute()
    {


        average = (m1+m2+m3)/3;

        if(m1>m2)
        {
            if(m1>m3)
            {
                max = m1;
            }
            else
            {
                max = m3;
            }

        }
        else
        {
            if(m2>m3)
            {
                max = m2;
            }
            else
            {
                max = m3;
            }
        }

    }


    void display()
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.printf("marks in 3 subjects are %.3f , %.3f , %.3f",m1,m2,m3);
        System.out.println();
        System.out.println("maximum marks :"+max);
        System.out.printf("Average marks : %.3f",average);


    }
}
