package W4.soal1;

public class Main {
    public static void main(String[] args) {
        Product prod = new Product("Laptop", 150000000, 10);
        
        Sales sales = new Sales(prod);
        System.out.println();

        sales.sellProduct(3);
        System.out.println();

        sales.restockProduct(5);
        System.out.println();

        sales.updateProductPrice(14000000);
        System.out.println();

        sales.updateProductPrice(-14000000);

    }
}  