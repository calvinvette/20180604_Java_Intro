public class TestVIP {
    public static void main(String[] args) {
//        VIPCustomer harry = new VIPCustomer();
        VIPCustomer harry = new VIPCustomer("Harry", "Potter");
//        harry.setFirstName("Harry");
//        harry.setLastName("Potter");
        System.out.println(harry);
        System.out.println(Customer.getNumberOfCustomers());

        Customer ron = new Customer(1235L, "Ronald", "Weasley", "+44 0206 931-1593", -1L, -1L);
        System.out.println(ron);
        System.out.println(Customer.getNumberOfCustomers());

    }
}
