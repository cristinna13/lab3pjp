package lab3;

public class parabola
{
    private int a,b,c;

    public parabola(int a,int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public punct varfparabola()
    {
        double x =  (double)-b / (2*a);
        double y =  (double)(-(b*b) + 4 * a * c) / (4 * a);
        return new punct(x, y);
    }

    public static punct mijloc(punct p1, punct p2)
    {
        return new punct((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
    }

    public punct mijlocparametru(parabola parab)
    {
        return mijloc(this.varfparabola(), parab.varfparabola());
    }

    public static punct mijlocdoiparametri(parabola par1, parabola par2)
    {
        return mijloc(par1.varfparabola(), par2.varfparabola());
    }

    public double lungimeparametru(parabola par)
    {
        punct p1 = this.varfparabola();
        punct p2 = par.varfparabola();
        return Math.hypot(p1.getX() - p2.getX(), p1.getY() - p2.getY());
    }

    public static double lungimedoiparametri(parabola par1, parabola par2)
    {
        punct p1 = par1.varfparabola();
        punct p2 = par2.varfparabola();
        return Math.hypot(p1.getX() - p2.getX(), p1.getY() - p2.getY());
    }

    @Override
    public String toString()
    {
        return "f(x) = " + a + "x^2 + " + b + "x + " + c;
    }
}
