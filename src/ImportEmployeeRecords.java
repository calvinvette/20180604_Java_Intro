import java.io.BufferedReader;
import java.io.FileReader;
import java.rmi.server.ExportException;

public class ImportEmployeeRecords {
    public static void main(String[] args) throws Exception {
        BufferedReader customerFile = new BufferedReader(new FileReader("customers.txt"));
        String line;
        boolean isFirstRow = true;
        Customer[] customers = new Customer[15];
        int index = 0;
        while ((line = customerFile.readLine()) != null) {
            String[] fields = null;
            try {
                if (isFirstRow) {
                    isFirstRow = false;
                    continue;
                }
                fields = line.split("\t");

                // public Customer(Long customerId, String firstName, String lastName, String phoneNumber, Long homeAddress, Long workAddress) {
                customers[index] =
                        new Customer(
                                Long.parseLong(fields[0]), /// Integer.parseInt(str)  Double.parseDouble(str) Float.parseFloat(str)
                                fields[1],
                                fields[2],
                                fields[3],
                                Long.parseLong((fields[4].equals("NULL") ? "-1" : fields[4])), // Ternary operator; inline if-else
                                Long.parseLong((fields[5].equals("NULL") ? "-1" : fields[5]))
                        );
                index++;
            } catch (ArrayIndexOutOfBoundsException aioobe)  {
                Customer[] biggerCustomers = new Customer[customers.length + 1];
                System.arraycopy(customers, 0, biggerCustomers, 0, customers.length);
                biggerCustomers[biggerCustomers.length - 1] = new Customer(
                        Long.parseLong(fields[0]), /// Integer.parseInt(str)  Double.parseDouble(str) Float.parseFloat(str)
                        fields[1],
                        fields[2],
                        fields[3],
                        Long.parseLong((fields[4].equals("NULL") ? "-1" : fields[4])), // Ternary operator; inline if-else
                        Long.parseLong((fields[5].equals("NULL") ? "-1" : fields[5]))
                );
            }
        }
        System.out.println("Total # of customers: " + customers.length);
        for (Customer cust: customers) {
            System.out.println(cust);
        }
    }
}
