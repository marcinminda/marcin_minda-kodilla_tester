package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;
import com.kodilla.stream.User;

import java.util.List;
import java.util.OptionalDouble;

public class ForumStats {

    public static OptionalDouble getAveragePostsAbove40(List<User> users) {
        if (users.isEmpty()) {
            return OptionalDouble.empty();
        }
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average();
    }

    public static OptionalDouble getAveragePostsBelow40(List<User> users) {
        if (users.isEmpty()) {
            return OptionalDouble.empty();
        }
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average();
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        if (users.isEmpty()) {
            System.out.println("Lista użytkowników jest pusta");
            return;
        }

        OptionalDouble avgPostsAbove40 = getAveragePostsAbove40(users);
        OptionalDouble avgPostsBelow40 = getAveragePostsBelow40(users);

        if (avgPostsAbove40.isPresent()) {
            System.out.println("Średnia liczba postów dla użytkowników w wieku 40+: " + avgPostsAbove40.getAsDouble());
        } else {
            System.out.println("Brak użytkowników w wieku 40+");
        }

        if (avgPostsBelow40.isPresent()) {
            System.out.println("Średnia liczba postów dla użytkowników poniżej 40 lat: " + avgPostsBelow40.getAsDouble());
        } else {
            System.out.println("Brak użytkowników poniżej 40 lat");
        }
    }
}
