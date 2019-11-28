package bookapples;

import java.util.function.Predicate;

public class AppleHeavyWeightPredicate implements Predicate<Apple> {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
