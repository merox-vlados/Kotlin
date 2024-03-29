import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int numberOfHouse;

    public Address(String city, String street, int numberOfHouse) {
        this.city = city;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(hashCode() != obj.hashCode()) {
            return false;
        }
        if(obj instanceof Address) {
            Address address = (Address) obj;
            return this.city.equals(address.city) && this.street.equals(address.street) && this.numberOfHouse == address.numberOfHouse;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return city.hashCode() + street.hashCode() + numberOfHouse;
    }
}
