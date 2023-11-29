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
        while (player < boardSize) {
            System.out.println("Press enter to roll the dice");
            scanner.nextLine();

            int dice = random.nextInt(6) + 1;
            System.out.println("You rolled a " + dice);
        }
    }
}
