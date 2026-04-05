package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int computer = rand.nextInt(3) + 1;

        System.out.print("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
        int user = input.nextInt();

        String compChoice = "";
        String userChoice = "";

        if (computer == 1)
            compChoice = "Rock";
        else if (computer == 2)
            compChoice = "Paper";
        else
            compChoice = "Scissors";

        if (user == 1)
            userChoice = "Rock";
        else if (user == 2)
            userChoice = "Paper";
        else if (user == 3)
            userChoice = "Scissors";
        else
            userChoice = "Invalid";

        System.out.println("\nYou chose: " + userChoice);
        System.out.println("Computer chose: " + compChoice);

        if (user < 1 || user > 3) {
            System.out.println("Invalid input.");
        } else if (user == computer) {
            System.out.println("It's a tie!");
        } else if ((user == 1 && computer == 3) ||
                   (user == 2 && computer == 1) ||
                   (user == 3 && computer == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        input.close();
    }
}