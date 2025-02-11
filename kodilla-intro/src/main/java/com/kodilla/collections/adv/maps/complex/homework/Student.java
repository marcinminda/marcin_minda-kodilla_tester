package com.kodilla.collections.adv.maps.complex.homework;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Integer> numberStudents = new ArrayList<>();

    public Student(List<Integer> numberStudents) {
        this.numberStudents = numberStudents;
    }

    public int getTotalStudents() {
        int sum = 0;
        for (int num : numberStudents) {
            sum += num;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + numberStudents +
                '}';
    }
}
