package pl.msendyka.examples.callback;

public class Controller {

    private String label1;
    private String label2;

    private final Service service1 = new Service("label 1 computed value");
    private final Service service2 = new Service("label 2 computed value");

    public void loadData() {
        service1.load((value -> label1 = value));
        service2.load((value -> label2 = value));
        System.out.println("Computed label1: " + label1);
        System.out.println("Computed label2: " + label2);
    }

    public static void main(String[] args) {
        new Controller().loadData();
    }
}
