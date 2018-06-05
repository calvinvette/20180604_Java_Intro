public class VIPCustomer extends Customer { // is-a relationship; VIPCustomer is a Customer
    private float discount = 0.10F;

    public VIPCustomer() {
        super();
    }

//    public VIPCustomer(Long customerId, String firstName, String lastName) {
//        this
//    }

    public VIPCustomer(String firstName, String lastName) {
        this(firstName, lastName, null, -1L, -1L);
    }

    public VIPCustomer(String firstName, String lastName, String phoneNumber, Long workAddress, Long homeAddress) {
        super( firstName, lastName, phoneNumber, homeAddress, workAddress);
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "VIPCustomer{" +
                super.toString() + ", " +
                "discount=" + discount +
                '}';
    }
}
