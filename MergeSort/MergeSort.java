package MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 99, 66, 61, 32, 44, 99 };
        int[] ans = sort(arr);
        for (int i : ans)
            System.out.print(i + " ");
        System.out.println(Arrays.toString(ans));

    }

    static int[] sort(int[] arr) {
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] l, int[] r) {
        int[] mix = new int[l.length + r.length];

        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length) {
            if (l[i] < r[j]) {
                mix[k++] = l[i++];
            } else {
                mix[k++] = r[j++];
            }
        }
        // adding remaining elements
        while (i < l.length)
            mix[k++] = l[i++];

        while (j < r.length)
            mix[k++] = r[j++];

        return mix;
    }
}
