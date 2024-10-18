package W9.SK3;

public class Salesperson implements Comparable<Salesperson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        this.firstName = first;
        this.lastName = last;
        this.totalSales = sales;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true; 
        }
        if (other instanceof Salesperson) {
            Salesperson otherSalesperson = (Salesperson) other; 
            return lastName.equals(otherSalesperson.getLastName()) &&
                   firstName.equals(otherSalesperson.getFirstName());
        }
        return false;
    }

    @Override
    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales; 
        }
        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison; 
        }
        return this.firstName.compareTo(other.firstName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }
}
