
import java.util.*;

public class euclidGCD {
    static int gcd(int x, int y) {
        // base case
        if (y == 0)
            return x;

        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x, y));
        sc.close();
    }
}
