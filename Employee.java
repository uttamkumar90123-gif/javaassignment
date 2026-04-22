import java.util.*;
import java.util.stream.*;
public class Employee {
    public static void main(String[] args) {

        List<EmployeeData> employees = Arrays.asList(
                new EmployeeData("Amit", 40000),
                new EmployeeData("Riya", 60000),
                new EmployeeData("Karan", 55000),
                new EmployeeData("Neha", 30000)
        );

        List<EmployeeData> result = employees.stream()
                .filter(emp -> emp.salary > 50000)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}

class EmployeeData {
    String name;
    int salary;

    EmployeeData(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " : " + salary;
    }
}
