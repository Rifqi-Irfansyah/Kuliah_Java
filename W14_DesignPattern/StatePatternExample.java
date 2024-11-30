package W14_DesignPattern;

// State interface
interface State {
    void handle(Context context);
}

// Concrete States
class StateA implements State {
    public void handle(Context context) {
        System.out.println("Handling State A");
        context.setState(new StateB());
    }
}

class StateB implements State {
    public void handle(Context context) {
        System.out.println("Handling State B");
        context.setState(new StateA());
    }
}

// Context
class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}

// Client
public class StatePatternExample {
    public static void main(String[] args) {
        Context context = new Context(new StateA());
        context.request(); // Handling State A
        context.request(); // Handling State B
    }
}