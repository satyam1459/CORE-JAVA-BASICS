public class printArray {
    static void printArray(int[] arr, int idx) {
        if (idx == arr.length)
            return;
        // SELF WORK
        System.out.println(arr[idx]);
        // Recursive work---> sub problem
        printArray(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        printArray(arr, 0);
    }

}
