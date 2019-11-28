package javafuncrions;

public class Employee {
    String name;
    double salaray;

    Employee(String name, double salaray) {
        this.name = name;
        this.salaray = salaray;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaray=" + salaray +
                '}';
    }
}
