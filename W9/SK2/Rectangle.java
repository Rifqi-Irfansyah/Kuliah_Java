package W9.SK2;

public class Rectangle extends  Shape{
    private final double radius;
    private final double height;
    
    public  Rectangle(double r, double h){
        super("Rectangle");
        radius = r;
        height = h;
    }

    @Override
    public double area(){
        return Math.PI*radius*radius*height;
    }

    @Override
    public String toString(){
        return super.toString() + " of radius " + radius + " & height " + height;
    }
}
