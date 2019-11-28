package functionschaining;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class MainClass {

    //function chaining
    //f1 & f2
    //1. f1.andThen(f2) f1 will be applied followed by f2
    //2. f1.compose(f2) f2 will be applied followed by f1

    public static void main(String[] args) {

        UnaryOperator<String> f1 = String::toUpperCase;
        UnaryOperator<String> f2 = s -> s.substring(0, 9);

        System.out.println(f1.andThen(f2).apply("andriusgeciauskas"));
        System.out.println(f1.compose(f2).apply("andriusgeciauskas"));


        IntUnaryOperator f3 = i -> i + i;
        IntUnaryOperator f4 = i -> i * i * i;

        System.out.println(f3.andThen(f4).applyAsInt(2)); //64
        System.out.println(f3.compose(f4).applyAsInt(2)); //16


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name");
        String username = sc.next();
        System.out.println("Enter password");
        String password = sc.next();

        UnaryOperator<String> f5 = s -> s.substring(0, 5);
        UnaryOperator<String> f6 = String::toLowerCase;
        if (f5.andThen(f6).apply(username).equals("durga") && password.equals("java")) {
            System.out.println("valid user");
        } else {
            System.out.println("invalid user");
        }

        //function identity static method
        Function<String, String> f7 = Function.identity();
        System.out.println(f7.apply("durga"));//durga


    }
}
