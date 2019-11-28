package twoargumentbifunctionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateClass {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> p = (x, y) -> (x + y) % 2 == 0;

        System.out.println(p.test(3, 4));
        System.out.println(p.test(10, 10));
    }
}
