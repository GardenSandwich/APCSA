package Unit_9._9_3.employees;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee e = new Employee("Karel", 75000);
        System.out.println(e);
        HourlyEmployee he = new HourlyEmployee("Mike", 18, 40);
        System.out.println(he);
    }
}
