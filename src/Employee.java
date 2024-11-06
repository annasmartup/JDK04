public class Employee {
    private int employeeId;
    private long phoneNumber;
    private String name;
    private int experience;

    public Employee(int employeeId, long phoneNumber, String name, int experience) {
        this.employeeId = employeeId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Табельный номер: " + employeeId + ". Имя: " + name + ". Номер телефона: " + phoneNumber + ". Стаж: "
                + experience;
    }
}
