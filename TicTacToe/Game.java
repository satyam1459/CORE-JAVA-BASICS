package TicTacToe;

import java.util.Scanner;

public class Game {

    public static Scanner sc = new Scanner(System.in);
    Board board;
    Player[] players;
    int turn;
    int noOfMoves;
    boolean gameOver;
    String zeroPattern;
    String crossPattern;

    Game(Board board, Player[] players) {
        this.board = board;
        this.players = players;
        this.turn = 0;
        this.noOfMoves = 0;
        zeroPattern = "";
        crossPattern = "";

        for (int i = 0; i < board.size; i++) { // helps to compare
            zeroPattern += 'O';
            crossPattern += 'X';
        }
    }

    public void Play() {
        System.out.println(board);
        while (!this.gameOver) {
            this.noOfMoves++;
            if (this.noOfMoves > board.size * board.size) {
                System.out.println("-----------------Match Draw-----------");
                return;
            }
            int[] index = getIndex();
            int rn = index[0], cn = index[1];
            board.board[rn][cn] = players[turn].symbol;
            if (this.noOfMoves >= 2 * board.size - 1 && checkIfGameEnded()) {
                System.out.println(board);
                this.gameOver = true;
                System.out.println(players[turn].name + " is Winner...!!!!!");
                return;
            }
            turn = (turn + 1) % 2;
            System.out.println(board);
        }
    }

    public int[] getIndex() {
        while (true) {
            System.out.print(players[turn].name + "'s turn, give position-->");
            int idx = sc.nextInt() - 1;
            int rn = idx / board.size, cn = idx % board.size;
            if (rn < 0 || cn < 0 || rn >= board.size || cn >= board.size) {
                System.out.println("Out of bound position");
                continue;
            }
            if (board.board[rn][cn] != '-') {
                System.out.println("Position already filled, try again...!!!");
                continue;
            }
            return new int[] { rn, cn };
        }
    }

    public boolean checkIfGameEnded() {

        // Row
        StringBuilder sb;
        for (int i = 0; i < board.size; i++) {
            sb = new StringBuilder();
            for (int j = 0; j < board.size; j++)
                sb.append(board.board[i][j]);
            if (sb.toString().equals(zeroPattern) || sb.toString().equals(crossPattern))
                return true;
        }

        // Column
        for (int i = 0; i < board.size; i++) {
            sb = new StringBuilder();
            for (int j = 0; j < board.size; j++)
                sb.append(board.board[j][i]);
            if (getResults(sb))
                return true;
        }

        // Major Diagonal
        int i = 0, j = 0;
        sb = new StringBuilder();
        while (i < board.size) {
            sb.append(board.board[i++][j++]);
        }
        if (getResults(sb))
            return true;

        // Minor Diagonal
        i = 0;
        j = board.size - 1;
        while (i < board.size) {
            sb = new StringBuilder();
            sb.append(board.board[i++][j--]);
        }
        if (getResults(sb))
            return true;

        return false;
    }

    public boolean getResults(StringBuilder sb) {
        if (sb.toString().equals(zeroPattern) || sb.toString().equals(crossPattern))
            return true;
        return false;
    }
}
