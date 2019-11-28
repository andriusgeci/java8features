package javastreams;

import java.util.stream.Stream;

public class MainEmployeeTest {

    public static void main(String[] args) {

        Stream.of(arrayOfEmps).forEach(employee -> System.out.println(employee.getName()));
    }

    private static Employee[] arrayOfEmps = {
            new Employee(1,"a",20),
            new Employee(2,"b",30),
            new Employee(3,"c",40),
    };
}
