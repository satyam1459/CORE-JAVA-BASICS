package SnakeAndLadder;

public class Coordinates {
    int rn;
    int cn;

    Coordinates(int rn, int cn) {
        this.rn = rn;
        this.cn = cn;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(this.rn).append(", ").append(cn).append("]");
        return sb.toString();
    }

}
