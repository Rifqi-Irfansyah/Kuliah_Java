package W6;
public class soal11{
    public static void main(String[] args) {
        Circle c1 = new Circle(10, "merah");
        System.out.println(" Warna Lingkaran Setelah Konstruktor = " + c1.getColor());

        c1.setColor("biru");
        System.out.println(" Warna Lingkaran Setelah Setter = " + c1.getColor());
    }
}

class Circle { // Save as "Circle.java"
 // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle(double radius, String color) { // 1st (default) constructor
        this.radius = radius;
        this.color = color;
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }
    /** Return a self-descriptive string of this instance in the form of
    Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


