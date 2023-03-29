public class findIndex {
    // return true if target is present in array else false
    static boolean search(int[] ar, int tar, int idx) {
        if (idx >= ar.length)
            return false;
        // self work
        if (ar[idx] == tar)
            return true;
        // recursive work
        return (search(ar, tar, idx + 1));

    }

    // return first idx of target element else -1;
    static int findIdx(int[] ar, int tar, int idx) {
        if (idx >= ar.length)
            return -1;
        // self work
        if (ar[idx] == tar)
            return idx;
        // recursive work
        return (findIdx(ar, tar, idx + 1));

    }

    public static void main(String[] args) {
        int[] ar = { 2, 23, 4, 5, 6 };
        int target = 23;
        System.out.println(findIdx(ar, target, 0));
        System.out.println(search(ar, 333, 0));
    }

}
