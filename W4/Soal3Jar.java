package W4;

import com.polban.jtk.sales.*;

public class Soal3Jar {
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