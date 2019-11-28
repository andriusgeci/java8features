package bookapples.firstapplequiz;

import bookapples.Apple;

public class AppleSimpleFormatter implements AppleFormatter {
    @Override
    public String accept(Apple a) {
        return "An apple of " + a.getWeight() + "g";
    }
}
