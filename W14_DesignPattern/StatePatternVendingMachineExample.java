package W14_DesignPattern;

// State interface
interface VendingMachineState {
    void insertCoin(VendingMachine context);
    void selectProduct(VendingMachine context);
    void dispenseProduct(VendingMachine context);
}

// Concrete States
class WaitingForCoinState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine context) {
        System.out.println("Coin inserted. You can now select a product.");
        context.setState(new SelectingProductState());
    }

    @Override
    public void selectProduct(VendingMachine context) {
        System.out.println("Please insert a coin first.");
    }

    @Override
    public void dispenseProduct(VendingMachine context) {
        System.out.println("Insert coin and select a product first.");
    }
}

class SelectingProductState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine context) {
        System.out.println("You have already inserted a coin. Select a product.");
    }

    @Override
    public void selectProduct(VendingMachine context) {
        System.out.println("Product selected. Dispensing product...");
        context.setState(new DispensingProductState());
    }

    @Override
    public void dispenseProduct(VendingMachine context) {
        System.out.println("Please select a product first.");
    }
}

class DispensingProductState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine context) {
        System.out.println("Please wait, dispensing the product.");
    }

    @Override
    public void selectProduct(VendingMachine context) {
        System.out.println("Already dispensing. Please wait.");
    }

    @Override
    public void dispenseProduct(VendingMachine context) {
        System.out.println("Product dispensed. Returning to waiting for coin state.");
        context.setState(new WaitingForCoinState());
    }
}

// Context
class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        this.currentState = new WaitingForCoinState(); // Initial state
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin(this);
    }

    public void selectProduct() {
        currentState.selectProduct(this);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct(this);
    }
}

// Client
public class StatePatternVendingMachineExample {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        // Simulate actions
        vendingMachine.selectProduct();  // "Please insert a coin first."
        vendingMachine.insertCoin();    // "Coin inserted. You can now select a product."
        vendingMachine.insertCoin();    // "You have already inserted a coin. Select a product."
        vendingMachine.selectProduct(); // "Product selected. Dispensing product..."
        vendingMachine.dispenseProduct(); // "Product dispensed. Returning to waiting for coin state."
        vendingMachine.dispenseProduct(); // "Insert coin and select a product first."
    }
}
