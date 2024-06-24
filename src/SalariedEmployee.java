import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

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

    public double collectPay(){
        if(isRetired){
            return (this.annualSalary*0.8)/26;
        }else{
            return this.annualSalary/26;
        }
    }

    public void retire(){
        LocalDate ld = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        String formatted = ld.format(formatter);
        terminate(formatted);
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
