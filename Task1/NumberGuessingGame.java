import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain = true;
        System.out.println("🎮 Welcome to the Number Guessing Game!");
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // 1 to 100
            int attempts = 0;
            int maxAttempts = 5;
            boolean hasWon = false;
            System.out.println("\nI'm thinking of a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts. Good luck!");
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                if (guess == numberToGuess) {
                    System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
                    score++;
                    hasWon = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
            if (!hasWon) {
                System.out.println("❌ You've used all attempts. The number was: " + numberToGuess);
            }
            System.out.println("Current Score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("Thanks for playing! Your total score: " + score);
        scanner.close();
    }
}
