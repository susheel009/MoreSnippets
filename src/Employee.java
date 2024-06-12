public class Employee extends Worker{

    public long employeeID;
    public String hireDate;

    public Employee(String name, String birthDate, String endDate, long employeeID, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeID = employeeID;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "endDate='" + endDate + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", employeeID=" + employeeID +
                "} " + super.toString();
    }
}
