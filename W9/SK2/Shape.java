package W9.SK2;

abstract class Shape {
    private final String shapeName;
    
    public abstract double area();
    
    public Shape(String name){
        this.shapeName = name;
    }
    
    public String toString(){
        return shapeName;
    }
}
