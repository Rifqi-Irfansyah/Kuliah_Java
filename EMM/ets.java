import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.*;

public class ets {
    public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
        Gson gson = new Gson();

		String JSON_FILE = "JSON/data.json";
        Delivery[] delivery = gson.fromJson(new FileReader(JSON_FILE),Delivery[].class);

        for (Delivery data : delivery) {
            System.out.println("Product Name    = " + data.getProductName());
            System.out.println("Quantity        = " + data.getQuantity());
            System.out.println("Weight          = " + data.getWeight());
            System.out.println("Destination     = " + data.getCity().getDestination());
            System.out.println("Service Package = " + data.getServicePackage().getService());
            System.out.println("Service Value   = " + data.getServicePackage().getValue());
            System.out.println("Cost Product    = " + data.getPriceItem());
            System.out.println("Total           = " + (data.getQuantity()*data.getPriceItem()+data.getServicePackage().getValue()) + "\n");
        }
    }
}