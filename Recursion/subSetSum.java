public class subSetSum {
    // n--> length of array, idx --> take index
    static void subsetSum(int[] a, int n, int idx, int sum) {
        // base case
        if (idx >= n) {
            System.out.print(sum + " ");
            return;
        }
        // curr idx + sum
        subsetSum(a, n, idx + 1, sum + a[idx]);

        // curr idx
        subsetSum(a, n, idx + 1, sum);

    }

    public static void main(String[] args) {
        int[] a = { 2, 4, 5, 7 };
        subsetSum(a, a.length, 0, 0);
    }
}
