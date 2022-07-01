package ThisReference;

public class Point 
{    
    int x,y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    Point()
    {
        this(10,10);
    }

    void print()
    {
        System.out.println(x +" "+ y);
    }

    Point setX(int x)
    {
        this.x = x;
        return this;
    }

    Point setY(int y)
    {
        this.y = y;
        return this;
    }

}
