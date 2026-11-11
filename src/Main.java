import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String computerChoice;
        String playAgain = "Yes";
        int playerWins = 0;
        int computerWins = 0;
        int playerStreak = 0;
        int computerStreak = 0;

        System.out.print("Welcome to the Rock, Paper, Scissors! What is your name? ");
        String playerName = scanner.nextLine();
        System.out.print("Welcome " + playerName + " to the Rock, Paper, Scissors DUEL! ");

        do {

        System.out.print("\nChoose your move: (Rock, Paper, Scissors) ");
        String playerChoice = scanner.nextLine().toUpperCase();

        if (!playerChoice.equals(MoveType.ROCK.toString()) &&
        !playerChoice.equals(MoveType.PAPER.toString()) &&
        !playerChoice.equals(MoveType.SCISSORS.toString())) {
            System.out.print("Please enter a valid move type. The available types are: Rock, Paper and Scissors.");
        }

        computerChoice = String.valueOf(MoveType.moveTypes[random.nextInt(3)]);

        System.out.print(playerName + " chooses " + playerChoice);
        System.out.print("\nComputer chooses: " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
            System.out.print("\nIt's a tie! ");
            System.out.print("\nPlayer wins: " + playerWins);
            System.out.print("\nComputer wins: " + computerWins);
            System.out.println("\nTry again? (Yes/No) ");
            playAgain = scanner.nextLine().toLowerCase();
            playerStreak = 0;
            computerStreak = 0;

        }   else if (playerChoice.equals(MoveType.ROCK.toString()) && computerChoice.equals(MoveType.PAPER.toString()) ||
                     playerChoice.equals(MoveType.PAPER.toString()) && computerChoice.equals(MoveType.SCISSORS.toString()) ||
                     playerChoice.equals(MoveType.SCISSORS.toString()) && computerChoice.equals(MoveType.ROCK.toString())) {
            computerWins++;
            System.out.print("\nYou lost, computer wins!");
            computerStreak++;
            System.out.print("\nPlayer wins: " + playerWins);
            System.out.print("\nComputer wins: " + computerWins);
            System.out.println("\nTry again? (Yes/No) ");
            playAgain = scanner.nextLine().toLowerCase();
            playerStreak = 0;

        }   else {
            System.out.print("\nYou win! ");
            playerWins++;
            playerStreak++;
            System.out.print("\nPlayer wins: " + playerWins);
            System.out.print("\nComputer wins: " + computerWins);
            System.out.println("\nTry again? (Yes/No) ");
            playAgain = scanner.nextLine().toLowerCase();
            computerStreak = 0;
        }

        if (playerStreak >= 3) {
            System.out.print("Holy shit! You're on a roll! You have won " + playerStreak + " times in a row!");

        } else if (computerStreak >= 3) {
            System.out.print("Damn bro, you lost " + computerStreak + " times in a row? You're down bad fr!");
        }

        } while (playAgain.equals("yes"));

        System.out.print("Thank you for playing! Have a nice day! :)");


        scanner.close();
    }
}
