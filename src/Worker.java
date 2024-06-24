public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){
        this("john","1-1-1980","N/A");
    }

    public Worker(String name, String birthDate, String endDate){
        this.name=name;
        this.birthDate=birthDate;
        this.endDate=endDate;
    }

    public int getAge(){
        int currentYear=2024;
        int birthYear = Integer.parseInt(this.birthDate.substring(this.birthDate.length()-4));
        return currentYear-birthYear;
    }

    public double collectPay(){

        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate=endDate;
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
