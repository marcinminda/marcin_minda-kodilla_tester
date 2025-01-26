package com.kodilla.abstracts;

public class JobApp {
    public static void main(String[] args) {
        Job teacher = new Teacher();
        Job doctor = new Doctor();

        Person person1 = new Person("Jan", 40, teacher);
        Person person2 = new Person("Karol", 50, doctor);

        person1.displayResponsibilities();
        person2.displayResponsibilities();
    }
}
