package TicTacToe;

import java.util.Scanner;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Welcome-------");

        System.out.println("Enter 1st player name--> ");
        String name = sc.next();
        Player p1 = new Player(name);
        System.out.println(p1);

        System.out.println("Enter 2nd player name--> ");
        String name1 = sc.next();
        Player p2 = new Player(name1);
        System.out.println(p2);

        System.out.print("Enter size of board -->");
        Board board = new Board(sc.nextInt());
        System.out.println(board);

        // Player[] players = new int[]{p1,p2};
        // Game game = new Game(board, new Player[] { p1, p2 });
        Game game = new OnePlayerGame(board, new Player[] { p1, p2 }, true);
        game.Play();
    }

}
