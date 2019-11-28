package javafuncrions;


import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class MainClass {

    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<>();
        populate(l);
        System.out.println(l);

        //total salary
        ToDoubleFunction<ArrayList<Employee>> f = l1 -> {
            double total = 0;
            for (Employee e : l1) {
                total += e.salaray;
            }
            return total;
        };
        System.out.println("The total salary of this month:" + f.applyAsDouble(l));

        //increment salary if employee salary is less than 3500
        Predicate<Employee> p = e -> e.salaray < 3500;
        Function<Employee, Employee> function1 = employee -> {
            employee.salaray = employee.salaray + 477;
            return employee;
        };

        ArrayList<Employee> incrementedSalariesList = new ArrayList<>();
        for (Employee e : l) {
            if (p.test(e)) {
                function1.apply(e);
                incrementedSalariesList.add(e);
            }
        }
        System.out.println("employees whos salaries incremented" + incrementedSalariesList);
    }

    private static void populate(ArrayList<Employee> l) {
        l.add(new Employee("Test1", 1000));
        l.add(new Employee("Test2", 2000));
        l.add(new Employee("Test3", 3000));
        l.add(new Employee("Test4", 4000));
        l.add(new Employee("Test5", 5000));
    }


}
