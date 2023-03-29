import java.util.ArrayList;

public class allIndices {
    static void findAllIndices(int[] arr, int n, int target, int idx) {
        // Base case
        if (idx >= n)
            return;

        // self work
        if (arr[idx] == target) {
            System.out.print(idx + " ");
        }
        // recursive work
        findAllIndices(arr, n, target, idx + 1);
    }

    // return arraylist of indices
    static ArrayList<Integer> findAllIndice(int[] arr, int n, int target, int idx) {
        ArrayList<Integer> ans = new ArrayList<>();
        // Base case
        if (idx >= n)
            return ans; // return empty arrayList

        // self work
        if (arr[idx] == target) { // ans -->
            ans.add(idx);
        }
        // recursive work
        ArrayList<Integer> smallAns = findAllIndice(arr, n, target, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        int[] ar = { 2, 2, 3, 4, 4, 5, 2 };
        findAllIndices(ar, ar.length, 2, 0);
        System.out.println();
        ArrayList<Integer> ans = findAllIndice(ar, ar.length, 2, 0);
        System.out.println(ans);
    }
}
