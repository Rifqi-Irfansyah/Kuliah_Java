package W14_DesignPattern;

// Prototype Interface
interface Prototype extends Cloneable {
    Prototype clone();
}

// Concrete Prototype
class ConcretePrototype implements Prototype {
    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

// Client
public class PrototypePatternExample {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Original");
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();
        clone.setField("Clone");

        System.out.println(prototype.getField()); // Original
        System.out.println(clone.getField());    // Clone
    }
}
