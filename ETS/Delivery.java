public class Delivery extends ServicePackage{
    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private int weight;
	private int quantity;
	private int priceItem;
	private String productName;
    private String statusPayment;
    private String methodPayment;

    public String getPaymentStatus(){
        return statusPayment;
    }

    public String getPaymentMethod(){
        return methodPayment;
    }

    public void setPaymentStatus(String statusPayment){
        this.statusPayment = statusPayment;
    }

    public void setPaymentMethod(String methodPayment){
        this.methodPayment = methodPayment;
    }

    public Delivery(Status status, ServicePackage servicePackage, City city, int weight, int quantity, int priceItem, String productName) {
        this.status = status;
        this.servicePackage = servicePackage;
        this.city = city;
        this.weight = weight;
        this.quantity = quantity;
        this.priceItem = priceItem;
        this.productName = productName;
    }

    public Delivery(int weighet, int quantity, int priceItem, String productName) {
        this.weight = weighet;
        this.quantity = quantity;
        this.priceItem = priceItem;
        this.productName = productName;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setQuantity(int quantity) {
       this.quantity = quantity;
    }

    public void setPriceItem(int priceItem) {
        this.priceItem = priceItem;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setServicePackage(ServicePackage servicePackage) {
        this.servicePackage = servicePackage;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getWeight() {
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPriceItem() {
        return priceItem;
    }

    public String getProductName() {
        return productName;
    }
    
    public Status getStatus() {
        return status;
    }

    public ServicePackage getServicePackage() {
        return servicePackage;
    }

    public City getCity() {
        return city;
    }
    
}
