import java.io.Serializable;
import java.util.Objects;

// POJO = Plain-old Java Object
//
public class Customer extends java.lang.Object implements Serializable {
    private static Long numberOfCustomers = 0L;

    private Long customerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Long homeAddress;
    private Long workAddress;

    public Customer() {
       this(null, null, null, -1L, -1L);
    }

    // From DB Table
    public Customer(Long customerId, String firstName, String lastName, String phoneNumber, Long homeAddress, Long workAddress) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        Customer.numberOfCustomers++;
    }

    // From Form, File, etc.
    public Customer(String firstName, String lastName, String phoneNumber, Long homeAddress, Long workAddress) {
        this(-1L, firstName, lastName, phoneNumber, homeAddress, workAddress);
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Long homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Long getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Long workAddress) {
        this.workAddress = workAddress;
    }

    public static Long getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public static void setNumberOfCustomers(Long numberOfCustomers) {
        Customer.numberOfCustomers = numberOfCustomers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(phoneNumber, customer.phoneNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, phoneNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", homeAddress=" + homeAddress +
                ", workAddress=" + workAddress +
                '}';
    }
}
