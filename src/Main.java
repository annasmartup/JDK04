import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();

        employeeDirectory.addEmployee(new Employee(1, 89454487950L, "Anna", 5));
        employeeDirectory.addEmployee(new Employee(2, 89748328474L, "Vasilyi", 12));
        employeeDirectory.addEmployee(new Employee(3, 89462994557L, "Boris", 5));
        employeeDirectory.addEmployee(new Employee(4, 80200047366L, "Svetlana", 3));
        employeeDirectory.addEmployee(new Employee(5, 89009883388L, "Yakov", 21));

        System.out.println("Сотрудники со стажем 5 лет:");
        List<Employee> experiencedEmployees = employeeDirectory.findByExperience(5);
        for (Employee employee : experiencedEmployees) {
            System.out.println(employee);
        }

        System.out.println("\nТелефоны сотрудников с именем 'Anna':");
        Long phoneNumber = employeeDirectory.findNumberByName("Anna");
        System.out.println(phoneNumber);

        System.out.println("\nСотрудник с табельным номером 3:");
        Employee employeeById = employeeDirectory.findById(3);
        if (employeeById != null) {
            System.out.println(employeeById);
        } else {
            System.out.println("Сотрудник не найден.");
        }
    }

}