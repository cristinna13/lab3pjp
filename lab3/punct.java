package lab3;

public class punct
{
    final double x;
    final double y;

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public punct(double x, double y)
    {
        super();
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
}
