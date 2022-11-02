public class O1 {
    public static void main(String[] args) {
    Area obj = new Area(5,7,10.5);

    obj.Show();
    }

}
class Perimeter
{
    double Length;
    double Breadth;

    Perimeter(double Length,double Breadth)
    {
        this.Length = Length;
        this.Breadth = Breadth;

    }



    double Calculate()
    {
        return 2 * (Length+Breadth);

    }

    void Show()
    {
        System.out.println("Length : "+Length);
        System.out.println("Breadth : "+Breadth);
        System.out.println("Perimeter : "+Calculate());

    }
}
class Area extends Perimeter
{
    double height;
    double area;
    Area(double Length,double Breadth,double height)
    {
        super(Length,Breadth); // we are using the super keyword to call the super
        // constructor ie the constructor of the super class and we are assigning the values of
        // Length and Breadth which are being inputter by the user by using this child class only
        // and we are just passing it to the super class for the use
        this.height = height;
    }

    void doArea()
    {
        System.out.println("Area = Breadth and Height "+(Breadth*height));
    }

    void Show()
    {
        System.out.println("Length : "+Length);
        System.out.println("Breadth : "+Breadth);
        System.out.println("Perimeter : "+Calculate());
        System.out.println("Height : "+height);
        System.out.println();
        doArea();
    }
}
