package functionsconsumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class MainStudentClass {


    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<>();
        populate(l);
        Predicate<Student> p = student -> student.marks >= 60;
        Function<Student, String> f = student -> {
            int marks = student.marks;
            if (marks >= 80) {
                return "A";
            } else if (marks >= 60) {
                return "B";
            } else if (marks >= 50) {
                return "C";
            } else if (marks >= 35) {
                return "D";
            } else {
                return "E";
            }
        };
        Consumer<Student> c = student -> {
            System.out.println("name of the student" + student.name);
            System.out.println("marks of the student" + student.marks);
            System.out.println("grade of the student" + f.apply(student));
        };

        l.forEach(student -> {
            if (p.test(student)) {
                c.accept(student);
            }
        });
    }

    private static void populate(ArrayList<Student> l) {
        l.add(new Student("name1", 100));
        l.add(new Student("name2", 65));
        l.add(new Student("name3", 55));
        l.add(new Student("name4", 45));
        l.add(new Student("name5", 25));
    }

}

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
