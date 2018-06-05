public class TestEmployee {
    public static void testGoodEmployeeSalary() {
        Employee emp = new Employee();
        emp.setSalary(80000);
        emp.setName("Harry");
        System.out.println("emp salary = " + emp.getSalary());
        System.out.println("emp name = " + emp.getName());
    }

    public static void testBadEmployeeSalary() {
        Employee ron = new Employee();
//        try {
//            ron.setSalary(800000);
//        } catch (Exception e) {
//            System.out.println("Failed to set salary!");
//        }
        ron.setSalary(800000);
        ron.setName("Ron");
        System.out.println("ron salary = " + ron.getSalary());
        System.out.println("ron name = " + ron.getName());
    }

    public static void testStringEmployeeSalary() {
        Employee hermione = new Employee("Hermione");
//        hermione.setName("Hermione");
        hermione.setSalary("100000"); // String, not a number; uses the overloaded setSalary method
        System.out.println("hermione salary = " + hermione.getSalary());
        System.out.println("hermione name = " + hermione.getName());
    }

    public static void testStringEmployeeBadSalary() {
        Employee neville = new Employee();
        neville.setName("Neville");
        neville.setSalary("800000");
        System.out.println("neville salary = " + neville.getSalary());
        System.out.println("neville name = " + neville.getName());
    }

    public static void main(String[] args) {
        testGoodEmployeeSalary();
        testBadEmployeeSalary();
        testStringEmployeeSalary();
        testStringEmployeeBadSalary();

        int x = 4, y;
        y = x++;
        if (x == y) {
            System.out.println("They're the same! " + x + " = " + y);
        } else {
            System.out.println("They're NOT the same! " + x + "!= " + y);
        }

        Employee g1 = new Employee("Ginny", 100000);
        Employee g2 = new Employee("Ginny", 100000);
        Employee g3 = new Employee("Ginny", 80000);
        Employee r1 = new Employee("Ron", 100000);
        if (g1 == g2) { // Compares memory location - "new" gives us a new memory block each time
            System.out.println("They're the same! " + g1 + " = " + g2);

        } else {
            System.out.println("They're NOT the same! " + g1 + " != " + g2);
        }
        if (g1.equals(g2)) { // compares "qualities" of g1 and g2, not memory location
            System.out.println("They're the same! " + g1 + " = " + g2);

        } else {
            System.out.println("They're NOT the same! " + g1 + " != " + g2);
        }
        if (g1.equals(g3)) { // compares "qualities" of g1 and g2, not memory location
            System.out.println("They're the same! " + g1 + " = " + g3);

        } else {
            System.out.println("They're NOT the same! " + g1 + " != " + g3);
        }
        if (g1.equals(r1)) { // compares "qualities" of g1 and g2, not memory location
            System.out.println("They're the same! " + g1 + " = " + r1);

        } else {
            System.out.println("They're NOT the same! " + g1 + " != " + r1);
        }

        String[] names = {"Harry", "Ron", "Hermione", "Neville", "Dean", "Seamus", "Ginny"};
        Employee[] emps = new Employee[names.length];
        for (int index = 0; index < names.length; index++) {
            String name = names[index];
            // System.out.println(name);
            emps[index] = new Employee(name, 50000);
        }

//        for (Employee emp: emps) {
//            System.out.println(emp);
//        }

        int otherIndex = 0;
        while (otherIndex < emps.length) {
            System.out.println(emps[otherIndex]);
            otherIndex++;
        }

        String hermione = new String("Hermione");

        System.out.println("Hermione".charAt(3));
        System.out.println(hermione.indexOf("i"));
        int firstE = hermione.indexOf("e");
        System.out.println(firstE);
        System.out.println(hermione.indexOf("e", firstE + 1));
        System.out.println(hermione.length());




//        otherIndex;
    }
}
