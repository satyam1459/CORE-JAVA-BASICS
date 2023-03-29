import java.util.*;

public class SnakeLadderGame {
    private static final int WINNING_POSITION = 100;
    private static final int SNAKE_BITE_DEDUCT_POINTS = 10;
    private static final int LADDER_CLIMB_ADD_POINTS = 20;
    private static final int NUM_PLAYERS = 2;

    private static Map<Integer, Integer> snakeLadderPositions = new HashMap<>();
    static {
        // Define the snake and ladder positions
        snakeLadderPositions.put(14, 7);
        snakeLadderPositions.put(19, 2);
        snakeLadderPositions.put(23, 16);
        snakeLadderPositions.put(48, 27);
        snakeLadderPositions.put(54, 39);
        snakeLadderPositions.put(62, 53);
        snakeLadderPositions.put(69, 33);
        snakeLadderPositions.put(72, 51);
        snakeLadderPositions.put(83, 76);
        snakeLadderPositions.put(95, 88);
        snakeLadderPositions.put(98, 80);
        snakeLadderPositions.put(7, 14);
        snakeLadderPositions.put(2, 19);
        snakeLadderPositions.put(16, 23);
        snakeLadderPositions.put(27, 48);
        snakeLadderPositions.put(39, 54);
        snakeLadderPositions.put(53, 62);
        snakeLadderPositions.put(33, 69);
        snakeLadderPositions.put(51, 72);
        snakeLadderPositions.put(76, 83);
        snakeLadderPositions.put(88, 95);
        snakeLadderPositions.put(80, 98);
    }

    private static int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        int[] playerPositions = new int[NUM_PLAYERS];
        int currentPlayer = 0;
        boolean gameOver = false;

        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            System.out.println("Player " + (currentPlayer + 1) + ", press Enter to roll the dice.");
            sc.nextLine();

            int diceRoll = rollDice();
            playerPositions[currentPlayer] += diceRoll;
            if (playerPositions[currentPlayer] > WINNING_POSITION) {
                playerPositions[currentPlayer] -= diceRoll;
                System.out.println("Player " + (currentPlayer + 1) + " rolled a " + diceRoll + " and moved to position "
                        + playerPositions[currentPlayer] + ", but went past the winning position.");
                currentPlayer = (currentPlayer + 1) % NUM_PLAYERS;
                continue;
            }
            System.out.println("Player " + (currentPlayer + 1) + " rolled a " + diceRoll + " and moved to position "
                    + playerPositions[currentPlayer]);

            if (playerPositions[currentPlayer] == WINNING_POSITION) {
                System.out.println("Player " + (currentPlayer + 1) + " has won!");
                gameOver = true;
                break;
            }

            if (snakeLadderPositions.containsKey(playerPositions[currentPlayer])) {
                int newPosition = snakeLadderPositions.get(playerPositions[currentPlayer]);
                if (newPosition < playerPositions[currentPlayer]) {
                    System.out.println("Player " + (currentPlayer + 1)
                            + " was bitten by a snake and moved down to position " + newPosition);
                } else if (newPosition > playerPositions[currentPlayer]) {
                    System.out.println("Player " + (currentPlayer + 1) + " climbed a ladder and moved up to position "
                            + newPosition);
                }

                playerPositions[currentPlayer] = newPosition;
            }

            currentPlayer = (currentPlayer + 1) % NUM_PLAYERS;
        }

        sc.close();
    }
}