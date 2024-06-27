public class Main {
    public static void main(String[] args) {
//        Worker susheel = new Worker("susheel","06-06-1993","Still Employed");
//        System.out.println(susheel);
//        System.out.println(susheel.getAge());
//        System.out.println(susheel.collectPay());

//        Employee suppu = new Employee("Supriya","24-04-1992","Still Employed","22-2-2021");
//        System.out.println(suppu);
//        System.out.println(suppu.getAge());
//        System.out.println(suppu.collectPay());

//        HourlyEmployee susheel = new HourlyEmployee("Susheel","6-6-1993","27-12-2023","7th-Sept-2023",90);
//        System.out.println(susheel);
//        System.out.println(susheel.getDoublePay());

//        SalariedEmployee susheel = new SalariedEmployee("Susheel","6-6-1993","N/A","24th-June-2024",120000,false);
//        System.out.println(susheel);
//        susheel.retire();
//        System.out.println(susheel);
//        System.out.println("Bi-weekly wages = "+ (int)susheel.collectPay());

        HourlyEmployee susheel = new HourlyEmployee("Susheel Kumar Raj Montihoka","6th June 1993","N/A","24th june 2024",54);
        System.out.println(susheel);
        System.out.println("Collected Pay = " + susheel.collectPay());
        System.out.println(susheel);
        susheel.getDoublePay();
        System.out.println(susheel);
        
        SalariedEmployee sam = new SalariedEmployee();
        System.out.println(sam);
    }
}