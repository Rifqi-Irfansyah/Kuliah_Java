package W9.SK2;

public class Paint {
    private final double coverage;

    public Paint (double c){
        coverage = c;
    }

    public double amount(Shape s){
        System.out.println("Computing amount for " + s.area());
        return s.area()/coverage;
    }
}
