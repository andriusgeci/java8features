package bookapples;

public class ThisIsAwesome {

    public static void main(String[] args) {
        process(()-> System.out.println("This is awesome!!"));
    }

    public static void process(Runnable r) {
        r.run();
    }

}
