
import java.util.*;

public class returnSSQ {
    static ArrayList<String> getSubsequences(String s) {
        ArrayList<String> ans = new ArrayList<>();
        // Base case
        if (s.length() == 0) {
            ans.add(" ");
            return ans;
        }
        char curr = s.charAt(0);

        ArrayList<String> smallAns = getSubsequences(s.substring(1));
        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // getSubsequences(s);
        int[] ar = { 1, 2, 3 };
        String str = "";
        // for (int i = 0; i < 3; i++) {
        // str += ar[i];
        // }

        System.out.println(str);
        ArrayList<String> ss = getSubsequences(Arrays.toString(ar));
        for (String sss : ss)
            System.out.print(sss + " ");
        System.out.println();
        System.out.println(ss.size());

    }
}
