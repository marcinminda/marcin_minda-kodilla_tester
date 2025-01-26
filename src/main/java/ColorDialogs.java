import java.util.Scanner;
public class ColorDialogs {
    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter letter:");
            String letter = scanner.nextLine().trim();
            if (letter.length() == 1) {
                return letter;  // Zwraca literę
            } else {
                System.out.println("Please enter a single letter.");
            }
        }
    }
}
