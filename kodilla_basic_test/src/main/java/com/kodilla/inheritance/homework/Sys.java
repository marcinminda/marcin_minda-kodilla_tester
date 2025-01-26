package com.kodilla.inheritance.homework;

public class Sys {
    public static void main(String [] args){
        System1 system1 = new System1 (2010);
        system1.turnOn();

       System2 system2 = new System2(2024);
       system2.turnOff();

       OperatingSystem operatingSystem = new OperatingSystem(2025);
       operatingSystem.turnOn();
       operatingSystem.turnOff();
    }
}
