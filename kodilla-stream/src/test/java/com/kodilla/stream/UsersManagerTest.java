package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames() {
        // given
        List<User> users = new ArrayList<>();
        users.add(new User("James", 50, 7, "Chemists"));
        users.add(new User("John", 25, 4648, "Sales"));
        users.add(new User("Peter", 49, 0, "Board"));
        users.add(new User("Poul", 44, 2, "Chemists"));

        // when
        List<String> result = users.stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(User::getUsername)
                .collect(Collectors.toList());

        // then
        List<String> expectedList = List.of("James", "Poul");

        assertEquals(expectedList, result);
    }

    @Test
    public void testgetUsersOlder(){
        // given
        List<User> users = new ArrayList<>();
        users.add(new User("James", 50, 7, "Chemists"));
        users.add(new User("John", 25, 4648, "Sales"));
        users.add(new User("Peter", 49, 0, "Board"));
        users.add(new User("Poul", 44, 2, "Chemists"));

//        when
        List<String> result1 = users
                .stream()
                .filter(user -> user.getAge()> 49 )
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

//        then
       // List<String> expectedList1 = List.of("James");
        List<String> expectedList1 = List.of("Jo");

        assertEquals(expectedList1, result1);
    }

    @Test
    public void testgetBestUser(){
        // given
        List<User> users = new ArrayList<>();
        users.add(new User("James", 50, 7, "Chemists"));
        users.add(new User("John", 25, 4648, "Sales"));
        users.add(new User("Peter", 49, 0, "Board"));
        users.add(new User("Poul", 44, 2, "Chemists"));

//        when
        List<String> result2 = users
                .stream()
                .filter(user -> user.getNumberOfPost()> 10 )
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

//        then
        List<String> expectedList1 = List.of("John");
       // List<String> expectedList1 = List.of("Alice");

        assertEquals(expectedList1, result2);
    }


}