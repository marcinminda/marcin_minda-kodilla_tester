package com.kodilla.collections.adv.maps.complex.homework;

import com.kodilla.collections.adv.maps.complex.Grades;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, Student> school = new HashMap<>();

        Principal john = new Principal("John", "Stevenson", "PSP1");
        Principal jessie = new Principal("Jessie", "Pinkman", "PSP2");
        Principal bart = new Principal("Bart", "Simpson", "PSP3");

        Student johnnumberStudents = new Student(Arrays.asList(100, 200, 300, 100));
        Student jessienumberStudents = new Student(Arrays.asList(150, 20, 30, 10, 200));
        Student bartnumberStudents = new Student(Arrays.asList(10, 250, 350, 20));

        school.put(john, johnnumberStudents);
        school.put(jessie, jessienumberStudents);
        school.put(bart, bartnumberStudents);

        for (Map.Entry<Principal, Student> schoolEntry : school.entrySet()) {
            System.out.println(schoolEntry.getKey().getFirstName() + " " + schoolEntry.getKey().getLastName() +
                    ", School: " + schoolEntry.getKey().getNameSchool() +
                    ", Total students: " + schoolEntry.getValue().getTotalStudents());
        }

    }
}
