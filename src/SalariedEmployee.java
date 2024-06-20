public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(){
        this("Default","1-1-1980","Still Employed","1-1-2024",120000,false);
    }

    public SalariedEmployee(String name, String birthDate, String endDate, String hireDate,double annualSalary,boolean isRetired) {
        super(name, birthDate, endDate, hireDate);
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
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
