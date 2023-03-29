package SnakeAndLadder;

public class Dice {
    public static int roll() {
        int Min = 1, Max = 6;
        double r = Math.random();
        int num = (int) (r * Max) + Min;
        return num;
    }

}
