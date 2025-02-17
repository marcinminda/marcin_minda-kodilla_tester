
import com.kodilla.stream.User;
import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    void testGetAveragePostsAbove40() {
        List<User> users = Arrays.asList(
                new User("Alice", 45, 10, "Group1"),
                new User("Bob", 50, 20, "Group2"),
                new User("Charlie", 39, 30, "Group1"),
                new User("David", 40, 0, "Group2")
        );

        OptionalDouble result = ForumStats.getAveragePostsAbove40(users);
        assertTrue(result.isPresent());
        assertEquals(10.0, result.getAsDouble(), 0.01);
//        assertEquals(5, result.getAsDouble(), 0.01);
    }

    @Test
    void testGetAveragePostsBelow40() {
        List<User> users = Arrays.asList(
                new User("Alice", 45, 10, "Group1"),
                new User("Bob", 50, 20, "Group2"),
                new User("Charlie", 39, 30, "Group1"),
                new User("David", 25, 40, "Group2")
        );

        OptionalDouble result = ForumStats.getAveragePostsBelow40(users);
        assertTrue(result.isPresent());
        assertEquals(35.0, result.getAsDouble(), 0.01);
    }

    @Test
    void testGetAveragePostsAbove40_EmptyList() {
        List<User> users = Arrays.asList();
//        List<User> users = Arrays.asList(new User("Alice", 45, 10, "Group1"));

        OptionalDouble result = ForumStats.getAveragePostsAbove40(users);
        assertFalse(result.isPresent());
//        System.out.println("Lista użytkowników jest pusta");
    }

    @Test
    void testGetAveragePostsBelow40_EmptyList() {
        List<User> users = Arrays.asList();

        OptionalDouble result = ForumStats.getAveragePostsBelow40(users);
        assertFalse(result.isPresent());
        System.out.println("Lista użytkowników jest pusta");
    }

    @Test
    void testGetAveragePostsAbove40_NoUsersAbove40() {
        List<User> users = Arrays.asList(
                new User("Charlie", 35, 30, "Group1"),
                new User("David", 25, 40, "Group2")
        );

        OptionalDouble result = ForumStats.getAveragePostsAbove40(users);
        assertFalse(result.isPresent());
        System.out.println("Brak użytkowników w wieku 40+");
    }

    @Test
    void testGetAveragePostsBelow40_NoUsersBelow40() {
        List<User> users = Arrays.asList(
                new User("Alice", 45, 10, "Group1"),
                new User("Bob", 50, 20, "Group2")
        );

        OptionalDouble result = ForumStats.getAveragePostsBelow40(users);
        assertFalse(result.isPresent());
        System.out.println("Brak użytkowników poniżej 40 lat");
    }
}
