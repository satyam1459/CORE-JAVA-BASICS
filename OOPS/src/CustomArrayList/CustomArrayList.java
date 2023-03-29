package OOPS.src.CustomArrayList;

public class CustomArrayList {
    int cap;
    int[] arr;
    int nel; // next element

    public CustomArrayList() {
        cap = 10;
        arr = new int[cap];
        nel = 0;
    }

    public void add(int ele) {
        if (this.nel == cap)
            grow();
        arr[this.nel] = ele;
        this.nel++;
    }
    // to add one element it takes 30 operation
    // And add n elements it takes 30n times

    public int size() {
        return this.nel;
    }

    public int get(int idx) {
        if (idx < 0 || idx >= this.size()) {
            System.out.println("No elements present at this idx");
            return -1;
        }
        return this.arr[idx];
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int remove() {
        if (this.size() == 0) {
            System.out.println("No elements to remove");
            return -1;
        }
        return arr[--this.nel];
    }

    public int remove(int idx) {
        if (idx < 0 || idx >= this.size()) {
            System.out.println("Invalid Index");
            return -1;
        }

        for (int i = idx; i < this.size() - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return arr[--this.nel];
    }

    // Here grow is called for 30 times
    public void grow() {
        // Doubling capacity
        this.cap *= 2;
        // Make new array of double capacity
        int[] temp = new int[cap];
        // Copying elements from old array
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        // assigning old array to new array with double capacity
        arr = temp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < this.size(); i++) {
            sb.append(arr[i]).append(", ");
        }
        if (sb.length() > 2)
            sb.delete(sb.length() - 2, sb.length());
        sb.append("]");

        return sb.toString();
    }
}
