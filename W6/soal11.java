package W6;
public class soal11{
    public static void main(String[] args) {
        Circle c1 = new Circle(10, "merah");
        System.out.println(" Warna Lingkaran Setelah Konstruktor = " + c1.getColor());

        c1.setColor("biru");
        System.out.println(" Warna Lingkaran Setelah Setter = " + c1.getColor());
    }
}

class Circle { 
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

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


