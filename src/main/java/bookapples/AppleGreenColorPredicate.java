package bookapples;

import java.util.function.Predicate;

public class AppleGreenColorPredicate implements Predicate<Apple> {

    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
