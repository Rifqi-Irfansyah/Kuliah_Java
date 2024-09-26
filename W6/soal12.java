package W6;
public class soal12 {
    public static void main (String[] args) {

    Cylinder c1 = new Cylinder();
    System.out.println("\nCylinder:"
    + "\n radius=" + c1.getRadius()
    + "\n height=" + c1.getHeight()
    + "\n area cylinder =" + c1.getArea()
    + "\n area circle   =" + c1.getAreaCircle()
    + "\n volume=" + c1.getVolume());

    Cylinder c2 = new Cylinder(10.0);
    System.out.println("\nCylinder:"
    + "\n radius=" + c2.getRadius()
    + "\n height=" + c2.getHeight()
    + "\n area cylinder =" + c2.getArea()
    + "\n area circle   =" + c2.getAreaCircle()
    + "\n volume=" + c2.getVolume());

    Cylinder c3 = new Cylinder(2.0, 10.0);
    System.out.println("\nCylinder:"
    + "\n radius=" + c3.getRadius()
    + "\n height=" + c3.getHeight()
    + "\n area cylinder =" + c3.getArea()
    + "\n area circle   =" + c3.getAreaCircle()
    + "\n volume=" + c3.getVolume());
    }
}

class Cylinder extends circle { 
    private double height;

    public Cylinder() {
        super(2.0, "merah"); 
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super(3.0, "merah"); 
        this.height = height;
    }
    public Cylinder(double radius, double height) {
        super(radius, "merah"); 
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    public double getAreaCircle(){
        return super.getArea();
    }

    public double getVolume(){
        return getArea()*height;
    }
}


