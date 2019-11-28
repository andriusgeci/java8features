package functionsconsumer;

import java.util.function.Consumer;

public class MainClass {

    public static void main(String[] args) {

        Consumer<String> c = System.out::println;
        c.accept("hello");
    }
}
