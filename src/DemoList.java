import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class DemoList {

    public static void main(String[] args) throws Exception {
        BufferedReader customerFile = new BufferedReader(new FileReader("customers.txt"));
        String line;
        boolean isFirstRow = true;
        List<Customer> customers = new Vector<>();
        while ((line = customerFile.readLine()) != null) {
            String[] fields = null;
            if (isFirstRow) {
                isFirstRow = false;
                continue;
            }
            fields = line.split("\t");
            customers.add(
                    new Customer(
                            Long.parseLong(fields[0]), /// Integer.parseInt(str)  Double.parseDouble(str) Float.parseFloat(str)
                            fields[1],
                            fields[2],
                            fields[3],
                            Long.parseLong((fields[4].equals("NULL") ? "-1" : fields[4])), // Ternary operator; inline if-else
                            Long.parseLong((fields[5].equals("NULL") ? "-1" : fields[5]))
                    )
            );
        }
        System.out.println("Total # of customers: " + customers.size());
        for (Customer cust : customers) {
            System.out.println(cust);
        }
        System.out.println("===============================================================================================================");

        System.out.println(customers.get(6));
        customers.remove(14);
        System.out.println("===============================================================================================================");
        for (Customer cust : customers) {
            System.out.println(cust);
        }

    }

}
