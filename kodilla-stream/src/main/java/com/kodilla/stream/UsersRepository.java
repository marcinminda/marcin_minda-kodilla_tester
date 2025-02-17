package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    public static List<User> getUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 10, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 15, 12, "Sales"));
        users.add(new User("Tuco Salamanca", 14, 116, "Manager"));
        users.add(new User("Gus Firing", 19, 0, "Board"));
        users.add(new User("Gale Boetticher", 14, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 27, 0, "Security"));
        return users;
    }
}
