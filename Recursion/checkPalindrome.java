import java.util.Scanner;

public class checkPalindrome {
    // printing reverse
    static String reverse(String s, int idx) {
        // base case
        if (idx == s.length())
            return "";

        // recursive work
        String smallAns = reverse(s, idx + 1);
        return smallAns + s.charAt(idx);
    }

    static boolean isPalind(String s, int l, int r) {
        // base case
        if (l >= r)
            return true;

        // recursive work
        return (s.charAt(l) == s.charAt(r) && isPalind(s, l + 1, r - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isPalind(s, 0, s.length() - 1));
    }

}
