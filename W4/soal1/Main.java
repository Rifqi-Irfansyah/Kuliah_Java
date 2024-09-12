package W4.soal1;
import W4.soal1.Product;
import W4.soal1.Sales;

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

// Kelas Product
class Product {
    // Atribut private untuk menyembunyikan informasi
    private String productName;
    private double price;
    private int stock;

    // Constructor
    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    // Getter dan Setter untuk mengontrol akses ke atribut
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Harga tidak valid!");
        }
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
        } else {
            System.out.println("Jumlah stok tidak valid!");
        }
    }

    public void sellProduct(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " " + productName + " terjual.");
        } else {
            System.out.println("Jumlah stok tidak cukup untuk penjualan.");
        }
    }
}

// Kelas Sales untuk mengelola transaksi penjualan
class Sales {
    private Product product;

    // Constructor
    public Sales(Product product) {
        this.product = product;
    }

    // Metode untuk melakukan penjualan
    public void sellProduct(int quantity) {
        System.out.println("Memproses penjualan...");
        product.sellProduct(quantity);
        System.out.println("Stok setelah penjualan: " +
                product.getStock());
    }

    // Metode untuk menambah stok produk
    public void restockProduct(int quantity) {
        System.out.println("Menambah stok...");
        product.addStock(quantity);
        System.out.println("Stok setelah penambahan: " +
                product.getStock());
    }

    // Metode untuk memperbarui harga produk
    public void updateProductPrice(double newPrice) {
        System.out.println("Memperbarui harga produk...");
        product.setPrice(newPrice);
        System.out.println("Harga baru: " + (int)(product.getPrice()));
    }
}