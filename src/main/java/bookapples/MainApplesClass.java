package bookapples;

import bookapples.firstapplequiz.AppleFancyFormatter;
import bookapples.firstapplequiz.AppleFormatter;
import bookapples.firstapplequiz.AppleSimpleFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainApplesClass {

    public static void main(String[] args) {

        List<Apple> appleList = filter(createApples(), (Apple apple) -> "green".equals(apple.getColor()));
        appleList.forEach(System.out::println);

        prettyPrintApples(createApples(), new AppleFancyFormatter());
        prettyPrintApples(createApples(), new AppleSimpleFormatter());

    }


    public static List<Apple> createApples() {

        List<Apple> appleList = new ArrayList<>();

        Apple a1 = new Apple("red", 100);
        Apple a2 = new Apple("green", 159);
        Apple a3 = new Apple("green", 200);
        Apple a4 = new Apple("green", 120);
        Apple a5 = new Apple("red", 180);
        Apple a6 = new Apple("red", 111);

        appleList.add(a1);
        appleList.add(a2);
        appleList.add(a3);
        appleList.add(a4);
        appleList.add(a5);
        appleList.add(a6);
        return appleList;
    }

    public static void prettyPrintApples(List<Apple> appleList, AppleFormatter appleFormatter) {
        appleList.forEach(apple -> System.out.println(appleFormatter.accept(apple)));
    }

    public static <T> List<T> filter(List<T> inventory, Predicate<T> p) {

        List<T> result = new ArrayList<>();
        for (T e : inventory) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }
}
