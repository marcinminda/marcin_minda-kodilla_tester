package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("p. Nowak");
        Teacher teacher2 = new Teacher("p. Kowalski");
        Teacher teacher3 = new Teacher("p. Malinowski");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Jasio", teacher1));
        students.add(new Student("Stasio", teacher2));
        students.add(new Student("Krzysio", teacher2));
        students.add(new Student("Marysia", null));
        students.add(new Student("Ania", null));
        students.add(new Student("Zuzia", teacher3));

        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("Uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }



    }
}
