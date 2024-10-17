package W9.SK2;

public class Cylinder extends  Shape{
    private final double width;
    private final double height;
    
    public  Cylinder(double w, double h){
        super("Cylinder");
        width = w;
        height = h;
    }

    @Override
    public double area(){
        return width*height;
    }

    @Override
    public String toString(){
        return super.toString() + " of width " + width + " & height " + height;
    }
}
