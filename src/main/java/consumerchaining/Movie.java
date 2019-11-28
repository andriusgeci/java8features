package consumerchaining;

import java.util.function.Consumer;

class Movie {

    String name;
    String result;

    Movie(String name, String result) {
        this.name = name;
        this.result = result;
    }
}

class MainMovieClass {
    public static void main(String[] args) {
        Consumer<Movie> c1 = movie -> System.out.println(movie.name + "is ready to release");
        Consumer<Movie> c2 = movie -> System.out.println("movie" + movie.name + " is " + movie.result);
        Consumer<Movie> c3 = movie -> System.out.println("movie" + movie.name + " is ready for database");
        Consumer<Movie> chainedC = c1.andThen(c2).andThen(c3);
        Movie m = new Movie("test1","hit");
        chainedC.accept(m);
    }
}
