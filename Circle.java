package OopsBasicPrograms;

public class Circle {
    int radius = 10;
    public void AreaOfCircle()
    {
       double areaOfCircle = Math.PI*radius*radius;
       System.out.println("Area of circle: " + areaOfCircle);
    }
    public void Circumference()
    {
        double circumference = 2*Math.PI*radius;
        System.out.println("Circumference of circle: " + circumference);
    }
}
class Circle2
{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.AreaOfCircle();
        circle.Circumference();
    }
}
