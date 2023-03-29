package SnakeAndLadder;

public class Player {
    String name;
    String color;

    Player(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.name).append(", Color --> ").append(this.color).append("\n");
        return sb.toString();
    }
}
