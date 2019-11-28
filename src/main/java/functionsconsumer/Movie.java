package functionsconsumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class MainMovieClass {

    public static void main(String[] args) {

        ArrayList<Movie> l = new ArrayList<>();
        poulate(l);

        Consumer<Movie> c = movie -> {
            System.out.println("movie name" + movie.name);
            System.out.println("movie hero" + movie.hero);
            System.out.println("movie heroin" + movie.heroin);
            System.out.println();
        };

        l.forEach(c::accept);
    }

    private static void poulate(ArrayList<Movie> l) {
        l.add(new Movie("testName1", "testHero1", "testHeorin1"));
        l.add(new Movie("testName2", "testHero2", "testHeorin2"));
        l.add(new Movie("testName3", "testHero3", "testHeorin3"));
        l.add(new Movie("testName4", "testHero4", "testHeorin4"));
        l.add(new Movie("testName5", "testHero5", "testHeorin5"));
        l.add(new Movie("testName6", "testHero6", "testHeorin6"));
        l.add(new Movie("testName7", "testHero7", "testHeorin7"));
    }
}

class Movie {

    String name;
    String hero;
    String heroin;

    Movie(String name, String hero, String heroin) {
        this.name = name;
        this.hero = hero;
        this.heroin = heroin;
    }
}

