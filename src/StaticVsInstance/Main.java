package StaticVsInstance;

public class Main {
    public static void main(String[] args) {
        StaticExample s1 = new StaticExample("Susheel");
        StaticExample s2 = new StaticExample("Supriya");
        s1.main();
        s2.main();

        InstanceExample s3 = new InstanceExample("Susheel");
        InstanceExample s4 = new InstanceExample("Supriya");
        s3.main();
        s4.main();

    }
}
