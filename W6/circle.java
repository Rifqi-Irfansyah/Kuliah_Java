package W6;

public class circle {
    private double radius;
    private String color;

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public circle(double r) { 
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
