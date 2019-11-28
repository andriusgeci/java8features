package twoargumentbifunctionalinterfaces;

import java.util.function.BiFunction;

public class BiFunctionClass {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> func = (a, b) -> a * b;
        System.out.println(func.apply(10, 20));
    }
}
