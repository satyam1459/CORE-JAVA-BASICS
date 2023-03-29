import java.util.Scanner;

public class reverse {
    static String reverseString(String s, int idx) {
        // base case
        if (idx == s.length())
            return "";

        String smallAns = reverseString(s, idx + 1);
        return smallAns + s.charAt(idx);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseString(s, 0));
    }

}
