import java.util.Scanner;
import java.util.Random;

public class PigGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int turnScore = 0;
        int turnCount = 1;

        System.out.println("Let's Play PIG!");

        while (totalScore < 20) {
            System.out.println("TURN " + turnCount);
            System.out.print("Roll or hold? (r/h): ");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("r")) {
                int die = random.nextInt(6) + 1;

                if (die == 1) {
                    System.out.println("Die: " + die);
                    System.out.println("Turn over. No score.");
                    turnScore = 0;
                    break;
                } else {
                    System.out.println("Die: " + die);
                    turnScore += die;
                }
            } else if (choice.equals("h")) {
                totalScore += turnScore;
                System.out.println("Score for turn: " + turnScore);
                System.out.println("Total score: " + totalScore);
                turnScore = 0;
                turnCount++;
            } else {
                System.out.println("Invalid choice. Please enter 'r' to roll or 'h' to hold.");
            }
        }

        System.out.println("\nYou finished in " + turnCount + " turns!");
        System.out.println("Game over!");
    }
}