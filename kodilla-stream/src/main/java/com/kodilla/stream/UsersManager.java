package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        List<String> result = UsersManager.getUsersOlder(40);
        System.out.println(result);
        List<String> result1 = UsersManager.getBestUser(100);
        System.out.println(result1);
    }

    private static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static List<String> getUsersOlder(int age ) {
        List<String> userage = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge()> age )
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return userage;
    }

    public static List<String> getBestUser(int posts ) {
        List<String> userage1 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost()> posts )
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return userage1;
    }
    public static String getUserName(User user) {
        return user.getUsername();
    }

}
