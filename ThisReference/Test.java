package ThisReference;

public class Test {
    public static void main(String[] args)
    {
        Point p = new Point(11,20);
        p.print();
        p.setX(10).setY(20).print(); //
        Point p1 = new Point();
        p1.print();
    }
}
