package TicTacToe;

public class Board {
    int size;
    char[][] board;

    Board(int size) {
        this.size = size;
        this.board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char[] oneD : board) {
            for (char c : oneD) {
                sb.append(c).append("  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
