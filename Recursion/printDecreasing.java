import java.util.Scanner;

public class printDecreasing {
    static void printDecreasing(int n) {
        // Base case
        if (n == 0)
            return;

        // Self work
        System.out.print(n + " ");

        // Recursive work
        printDecreasing(n - 1);
    }

    static int factorial(int n) {
        // small case
        if (n == 0)
            return 1;
        // smaller problem --> recursive work(factorial(n-1))
        // big problem self work--> [n * factorial(n - 1);]
        return n * factorial(n - 1);
    }

    static int fibo(int n) {
        // base case
        // if( n == 0) return n;
        // if( n == 1) return n;
        if (n == 0 || n == 1)
            return n;

        // // Subproblems --> recursive work
        // int prev = fibo(n - 1);
        // int prevprev = fibo(n - 2);

        // // self work
        // return prev + prevprev;
        return fibo(n - 1) + fibo(n - 2);
    }

    static int digitsSum(int n) {
        // Base case
        if (n >= 0 && n <= 9)
            return n;

        // recursive work--> small ans
        int smallAns = digitsSum(n / 10);

        // self work
        return smallAns + n % 10;
    }

    static int power(int x, int y) {
        // base
        if (y == 0)
            return 1;

        // // recursive work
        // int smallAns = power(x, y - 1);

        // return smallAns * x;

        return x * power(x, y - 1);
    }

    // second approach with better time complexity of calculating power
    static int pow(int p, int q) {
        if (q == 0)
            return 1;
        int smallPow = pow(p, q / 2);
        if (q % 2 == 0) {
            return smallPow * smallPow;
        } else {
            return p * smallPow * smallPow;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // printDecreasing(5);
        // System.out.println();
        // System.out.println(factorial(1));
        // System.out.println(fibo(7));
        // for (int i = 0; i <= 10; i++) {
        // System.out.println(fibo(i));
        // }

        System.out.println(digitsSum(8888));
        System.out.println(power(12, 3));
        System.out.println(pow(2, 11));

    }
}
