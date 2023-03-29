public class maxArray {
    static int findMax(int[] ar, int idx) {
        // base case
        if (idx == ar.length)
            return 0;

        // small problem --> idx+1 ,end of the array --> max -> recursive
        findMax(ar, idx + 1);

        // self work
        return Math.max(ar[idx], findMax(ar, idx + 1));
    }
    // tC -- > O(n)
    // Space C --> O(n)

    static int sum(int[] ar, int idx) {
        if (idx == ar.length - 1)
            return ar[idx];

        return ar[idx] + sum(ar, idx + 1);
    }

    public static void main(String[] args) {
        int[] ar = { 15, 6, 8, 7, 120 };
        System.out.println(findMax(ar, 0));
        System.out.println(sum(ar, 0));
        int sum = 0;
        for (int i = 0; i < ar.length; i++)
            sum += ar[i];
        System.out.println(sum);
    }

}
