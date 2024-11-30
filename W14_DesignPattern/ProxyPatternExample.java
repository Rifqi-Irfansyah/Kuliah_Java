package W14_DesignPattern;

// Subject Interface
interface Subject {
    void request();
}

// Real Subject
class RealSubject implements Subject {
    public void request() {
        System.out.println("Handling request in RealSubject.");
    }
}

// Proxy
class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    @Override
    public void request() {
        System.out.println("Proxy: Checking access...");
        realSubject.request();
    }
}

// Client
public class ProxyPatternExample {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }
}

