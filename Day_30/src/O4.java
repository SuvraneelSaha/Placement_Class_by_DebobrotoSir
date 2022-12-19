public class O4 {
    public static void main(String[] args) {
        point p1 = new point(0,0);
        point p2 = new point(2,3);
        point p3 = new point(4,7);


        p1.display();
        System.out.println(p1.getDistancefrom(p2));
        // call by reference example
        // this is a point
        // this is an illusion or abstraction
        // we are passing
        System.out.println(p1.equals(p2));
        p2.display();
        p1.increment(p2);
        //p1 is used for calling and the p2 object
        // is the one which is actually getting incremented
        //
        p2.display();


    }
}
class point
{
    int x,y; // class variable or instant variable
    point(int x,int y)
    {
        this.x = x;
        // right side er ta local
        this.y=y;
    }
    void display()
    {
        System.out.println("("+x+","+y+")");
    }
    double getDistancefrom(point p)
    {
        double d = Math.sqrt(Math.pow(p.x-x,2)+Math.pow(p.y-y,2));
        return d;

    }

    // say in the above code p1 is calling the get distance function
    // here the p.x is the p2 and the x is the p1's value
    boolean equals(point p)
    {
        if(x==p.x && y==p.y)
        {
            return true ;
        }
        else
        {
            return false;
        }
    }
    void increment(point p)
    {
        p.x++;
        p.y++;
    }

}
/*
if an object gets changed it is permanent -- call by reference
if an int or any value is passed in a function
then it is not permanent - call by value


 */
