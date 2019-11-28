package bookapples.firstapplequiz;

import bookapples.Apple;

public class AppleFancyFormatter implements AppleFormatter {

    @Override
    public String accept(Apple a) {
        String characteristics = a.getWeight() > 150 ? "Heavy" : "Light";
        return "A" + characteristics + a.getColor() + "Apple";
    }
}
