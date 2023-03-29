import java.util.Scanner;

public class removeOccurences {
    // dbacx --> dbcx

    static String removeA(String s, int idx) {
        // Base case
        if (idx == s.length())
            return "";

        // Recursive work
        String smallAns = removeA(s, idx + 1);
        char currChar = s.charAt(idx);

        // self work
        if (currChar != 'a')
            return currChar + smallAns; // d+bcx
        else
            return smallAns;
    }

    static String removeA2(String s) {
        if (s.length() == 0)
            return "";
        String smallAns = removeA2(s.substring(1));
        char currChar = s.charAt(0);
        // self work
        if (currChar != 'a')
            return currChar + smallAns; // d+bcx
        else
            return smallAns;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(removeA(s, 0));
        System.out.println(removeA2(s));
    }

}
