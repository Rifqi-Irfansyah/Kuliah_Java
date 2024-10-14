import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.*;

public class Main {
    public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
        Gson gson = new Gson();

		String JSON_FILE = "JSON/data.json";
        Delivery[] delivery = gson.fromJson(new FileReader(JSON_FILE),Delivery[].class);

        delivery[0].setPaymentMethod("Ovo");
        delivery[0].setPaymentStatus("Lunas");
        delivery[1].setPaymentMethod("Qris");
        delivery[1].setPaymentStatus("Belum Lunas");

        for (Delivery data : delivery) {
            System.out.println("Product Name    = " + data.getProductName());
            System.out.println("Quantity        = " + data.getQuantity());
            System.out.println("Weight          = " + data.getWeight());
            System.out.println("Destination     = " + data.getCity().getDestination());
            System.out.println("Service Package = " + data.getServicePackage().getService());
            System.out.println("Service Value   = " + data.getServicePackage().getValue());
            System.out.println("Cost Product    = " + data.getPriceItem());
            System.out.println("Total           = " + (data.getQuantity()*data.getPriceItem()+data.getServicePackage().getValue()) );
            System.out.println("Payment Method  = " + data.getPaymentMethod());
            System.out.println("Payment Status  = " + data.getPaymentStatus() + "\n");
        
        }
    }
}