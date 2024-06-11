package StaticVsInstance;

public class InstanceExample {
    private String name1;
    public InstanceExample(String name1){
        this.name1=name1;
    }

    public void main() {
        System.out.println("name =" + this.name1);
    }
}
