import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class DemoMap {
    public static void main(String[] args) throws Exception {
        BufferedReader customerFile = new BufferedReader(new FileReader("customers.txt"));
        String line;
        boolean isFirstRow = true;
        Map<String, Customer> customers  = new Hashtable<>();
        while ((line = customerFile.readLine()) != null) {
            String[] fields = null;
            if (isFirstRow) {
                isFirstRow = false;
                continue;
            }
            fields = line.split("\t");
            customers.put(
                    fields[2] + "," + fields[1], // Key is lastName,firstName
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

        System.out.println(customers.get("Weasley,Ginny"));
        System.out.println("===============================================================================================================");
        customers.remove("Malfoy,Draco");

        for( Customer cust: customers.values()) {
            System.out.println(cust);
        }
        System.out.println("===============================================================================================================");
        for(String key: customers.keySet()) {
            System.out.println(customers.get(key));
        }
        System.out.println("===============================================================================================================");
        for (Map.Entry<String, Customer> entries: customers.entrySet()) {
            System.out.println(entries.getKey() + " = " + entries.getValue());
        }
    }

    }
