public class HourlyEmployee extends Employee{

    public double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeID, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, employeeID, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay(){
        this.hourlyPayRate*=2;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                ", employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
