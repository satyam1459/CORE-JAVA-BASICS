import java.util.Scanner;

public class printMultiples {
    static void multiples(int n, int k) {
        // base case
        if (k == 0) {
            return;
        }

        // recursive work
        multiples(n, k - 1); // 5,10, 15

        // self work -->
        System.out.print(n * k + " "); // 20
    }

    static int seriesSum(int n) {
        // base case
        if (n == 0)
            return 0;

        return seriesSum(n - 1) + n;
    }

    static int alternateSeries(int n) {
        if (n == 0)
            return 0;

        if (n % 2 == 0)
            return alternateSeries(n - 1) - n;
        else
            return alternateSeries(n - 1) + n;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter num and no. of multiples -- > ");
        // int n = sc.nextInt();
        // int k = sc.nextInt();
        // multiples(n, k);
        System.out.println(seriesSum(1));
        System.out.println(alternateSeries(10));
    }
}
