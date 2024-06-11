public class Employee extends Worker{

    public long employeeID;
    public String hireDate;

    public Employee(String name, String birthDate, String endDate, long employeeID, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeID = employeeID;
        this.hireDate = hireDate;
    }


}
