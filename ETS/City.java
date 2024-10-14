public class City {
    private String origin;
    private String destination;

    public City(String origin, String destination){
        this.origin = origin;
        this.destination = destination;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getCity(){
        return origin;
    }
}
