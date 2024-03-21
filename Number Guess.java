package internship_project;

import java.util.Random;
import java.util.Scanner;

 class Guess_number {
  public static void main(String [] args) {
	  playGame();
  }
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        while (true) {
            // Step 1: Generate a random number within the specified range
            int secretNumber = random.nextInt(100) + 1;

            // Step 5: Limit the number of attempts
            int attempts = 0;
            int maxAttempts = 10;

            while (attempts < maxAttempts) {
                // Step 2: Prompt the user to enter their guess
                System.out.print("Guess the number (between 1 and 100): ");
                int userGuess = scanner.nextInt();
                // Step 3: Compare the user's guess and provide feedback
                if (userGuess == secretNumber) {
System.out.println("Congratulations! You guessed the correct number " + secretNumber +" in " + (attempts + 1) + " attempts.");
                    score++;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
                attempts++;}
            // Step 6: Ask the user if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }}
        // Step 7: Display the user's score
        System.out.println("Your score: " + score + " rounds won.");
        scanner.close();
    }}