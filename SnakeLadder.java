package Day9;

import java.util.Random;
import java.util.Scanner;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder game Program.");

        Scanner scanner = new Scanner(System.in); // scanner class for taking input
        Random random = new Random();             //to generate random input

        int player = 0;         //initializing the player position
        int boardSize = 100;
        int[] snakes = {16, 47, 49, 56, 62, 64, 87, 93};
        int[] ladders = {2, 4, 9, 21, 28, 36, 51, 71};
        int[] snakeBite = {6, 26, 11, 53, 33, 60, 24, 73};
        int[] ladderClimb = {38, 14, 31, 42, 84, 44, 67, 91};
        int rollCount = 0;                            // to count the number of rolls

        while (player < boardSize) {
            System.out.println("Press enter to roll the dice");
            scanner.nextLine();

            int dice = random.nextInt(6) + 1;
            rollCount++;
            System.out.println("You rolled a " + dice);

            if (player + dice <= boardSize) {
                player += dice;
                System.out.println("You are now at position " + player);

                for (int i = 0; i < snakes.length; i++) {
                    if (player == snakes[i]) {
                        System.out.println("Oops! Snake bite at " + player);
                        player = snakeBite[i];
                        System.out.println("You are now at position " + player);
                    }
                }

                for (int i = 0; i < ladders.length; i++) {
                    if (player == ladders[i]) {
                        System.out.println("Yay! Climbed a ladder at " + player);
                        player = ladderClimb[i];
                        System.out.println("You are now at position " + player);
                    }
                }
            } else {
                 System.out.println("You need " + (boardSize - player) + " to win. Try again.");
            }
        }
        System.out.println("Congratulations! You won in " + rollCount + " rolls.");
    }
}
