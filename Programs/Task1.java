import java.util.*;


public class Task1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int rounds = 1;
        boolean Again = true;
        String name;

        System.out.print("Enter your Name: ");
        name = sc.next();

        System.out.println("Welcome " + name + " to the Number Guessing Game!");

        while (Again) {
            Random rand=new Random();
            System.out.println("\n--- Round " + rounds + " ---");
            int target = rand.nextInt(100) + 1;
            int attempts = 0;
            int max = 10;
            boolean guessedCorrectly = false;
            int roundScore = 0; 

            System.out.println("I have generated a random number between 1 and 100. Can you guess it?");
            System.out.println("You have " + max + " attempts to guess the number correctly.");

            while (attempts < max) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess < target) {
                    System.out.println("Too low!");
                } else if (guess > target) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;

                   
                    roundScore = 100 - (attempts - 1) * 10; 
                    break;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all " + max + " attempts. The number was " + target + ".");
                roundScore = 0;
            }

            System.out.println("Your score for this round is: " + roundScore);
            score += roundScore;

            System.out.print("Do you want to play another round? (yes/no): ");
            String response = sc.next();
            Again = response.equalsIgnoreCase("yes");
            rounds++;
        }
    System.out.println("\nThank you for playing, " + name + "! Your final score is: " +score);

    }
}