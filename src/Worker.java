public class Worker {

    public String name;
    public String birthDate;
    public String endDate;

    public Worker(){
        this("john","1-1-1980","Still Employed");
    }

    public Worker(String name, String birthDate, String endDate){
        this.name=name;
        this.birthDate=birthDate;
        this.endDate=endDate;
    }

    public int getAge(){
        int currentYear=2024;
        String birthYearAsString = this.birthDate.substring(this.birthDate.length()-1,this.birthDate.length()-5);
        int birthYear = Integer.parseInt(birthYearAsString);
        return currentYear-birthYear;
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
