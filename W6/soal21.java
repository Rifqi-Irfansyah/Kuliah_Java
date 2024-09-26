package W6;

public class soal21 {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println("\nShape1 "
        + "\n Color = " + shape1.getColor() 
        + "\n Shape = " + shape1.getFilled() 
        + "\n Text  = " + shape1.toString());

        Shape shape2 = new Shape("merah", false);
        System.out.println("\nShape2 "
        + "\n Color = " + shape2.getColor() 
        + "\n Shape = " + shape2.getFilled() 
        + "\n Text  = " + shape2.toString());

        Circle circle = new Circle(2.5);
        System.out.println("\ncircle");
        System.out.println(" Area: " + circle.getArea());
        System.out.println(" Perimeter: " + circle.getPerimeter());
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(3.0, 4.0);
        System.out.println("\nrectangle"); 
        System.out.println(" Area: " + rectangle.getArea()); 
        System.out.println(" Perimeter: " + rectangle.getPerimeter()); 
        System.out.println(rectangle.toString());


        Square square = new Square(5.0);
        System.out.println("\nsquare"); 
        System.out.println(" Area: " + square.getArea()); 
        System.out.println(" Perimeter: " + square.getPerimeter());
        System.out.println(square.toString());

    }
}

class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}

class Circle extends Shape{
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super(); 
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled); 
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}

class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        super();
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width= "+ width + " and length= " + length + ", which is a subclass of " + super.toString();
    }
}

class Square extends Rectangle{
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side); 
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public String toString(){
        return "A Square with side="+ getSide() + ", which is a subclass of " + super.toString();
    }
}