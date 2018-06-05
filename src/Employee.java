import java.util.Objects;

public class Employee {
    private int salary;
    private String name;

    public Employee() {
        this("Unknown"); // Call the other CTOR with a String argument
//        this.name = "Unknown";
//        this.setName("Unknown");
    }

    public Employee(String name) {
//        this.name = name;

        this.setName(name);
    }

    public Employee(String name, int salary) {
        this.setName(name);
        this.setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(String salaryStr) {
        int salary = Integer.parseInt(salaryStr);
        setSalary(salary); // chain to the OTHER setSalary and use the same business rules
//        if (salary > 250000) {
////            throw new RuntimeException("Nice Try Buddy");
//            System.out.println("Can't accept a salary above $200,000");
//            return;
//        }
//        this.salary = salary;
    }

    public void setSalary(int salary) {
        if (salary > 230000) {
//            throw new RuntimeException("Nice Try Buddy");
            System.out.println("Can't accept a salary above $200,000");
            return;
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Add in business rules for the definition of a name (alpha-numerics and single-quote and hyphens)
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return (salary == employee.salary) // FALSE?
                &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                "salary=" + salary +
                '}';
    }
}
