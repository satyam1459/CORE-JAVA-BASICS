
import java.util.Scanner;

public class TicTacToe {
    private static int boardSize;
    private static char[][] board;
    private static char player;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the board: ");
        boardSize = scanner.nextInt();

        board = new char[boardSize][boardSize];
        initializeBoard();

        int moveCount = 0;
        player = 'X';
        while (true) {
            displayBoard();
            int[] move = getPlayerMove(scanner);
            board[move[0]][move[1]] = player;
            moveCount++;
            if (isWinner(move[0], move[1])) {
                displayBoard();
                System.out.println(player + " wins!");
                break;
            }
            if (moveCount == boardSize * boardSize) {
                displayBoard();
                System.out.println("Tie!");
                break;
            }
            player = (player == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void displayBoard() {
        System.out.println();
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[] getPlayerMove(Scanner scanner) {
        int row, col;
        do {
            System.out.print(player + "'s turn. Enter row and column (1-" + boardSize + "): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
        } while (!isValidMove(row, col));
        return new int[] { row, col };
    }

    private static boolean isValidMove(int row, int col) {
        if (row < 0 || row >= boardSize || col < 0 || col >= boardSize) {
            System.out.println("Invalid move. Please enter a valid row and column.");
            return false;
        } else if (board[row][col] != '-') {
            System.out.println("That cell is already occupied. Please choose another.");
            return false;
        }
        return true;
    }

    private static boolean isWinner(int row, int col) {
        char[] rowArray = new char[boardSize];
        char[] colArray = new char[boardSize];
        char[] diagArray = new char[boardSize];
        char[] antidiagArray = new char[boardSize];
        for (int i = 0; i < boardSize; i++) {
            rowArray[i] = board[row][i];
            colArray[i] = board[i][col];
            diagArray[i] = board[i][i];
            antidiagArray[i] = board[i][boardSize - i - 1];
        }
        return checkLine(rowArray) || checkLine(colArray) || checkLine(diagArray) || checkLine(antidiagArray);
    }

    private static boolean checkLine(char[] line) {
        boolean allEqual = true;
        for (int i = 1; i < boardSize; i++) {
            if (line[i] != line[0] || line[i] == '-') {
                allEqual = false;
                break;
            }
        }
        return allEqual;
    }
}
