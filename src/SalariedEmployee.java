public class SalariedEmployee extends Employee{

    public double annualSalary;
    public boolean isRetired;

    public SalariedEmployee(){
        this("Default","1-1-1980","Still Employed",123456,"1-1-2024",120000,false);
    }

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeID, String hireDate,double annualSalary,boolean isRetired) {
        super(name, birthDate, endDate, employeeID, hireDate);
        this.annualSalary=annualSalary;
        this.isRetired=isRetired;
    }

    public void retire(){
        this.isRetired=true;
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                ", employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
