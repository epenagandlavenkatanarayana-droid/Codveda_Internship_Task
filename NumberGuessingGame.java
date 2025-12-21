import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int min = 1;
        int max = 100;
        int maxAttempts = 10;
        int target = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        boolean win = false;

        System.out.println("--- Number Guessing Game ---");
        while (attempts < maxAttempts) {
            attempts++;
            System.out.print("Attempt " + attempts + ": Enter guess: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input!");
                scanner.next();
                attempts--;
                continue;
            }
            int guess = scanner.nextInt();
            if (guess == target) { win = true; break; }
            else if (guess < target) System.out.println("Too low!");
            else System.out.println("Too high!");
        }
        System.out.println(win ? "You won!" : "Game Over! Number was: " + target);
        scanner.close();
    }
}