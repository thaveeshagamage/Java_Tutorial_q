package Chapter9b;

public class Employee extends Person {
    private String employeeId;
    private String department;

    public Employee(){
        super("Thaveesha");
        System.out.println("Employee default constructor called");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
