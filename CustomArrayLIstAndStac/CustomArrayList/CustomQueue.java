package CustomArrayLIstAndStac.CustomArrayList;

public class CustomQueue {
    CustomArrayList qu;
    int front;

    CustomQueue() {
        qu = new CustomArrayList();
        front = 0;
    }

    public int pop() {
        if (qu.size() < 1) {
            System.out.println("Nothing to remove");
            return -1;
        }
        int val = qu.get(0);
        int size = qu.size() - 1;
        CustomArrayList temp = new CustomArrayList();
        for (int i = 0; i < size; i++) {
            temp.add(qu.get(i + 1));
        }
        qu = temp;
        return val;
    }

    public void add(int val) {
        qu.add(val);
    }

    public int peek() {
        if (qu.size() < 1) {
            System.out.println("Nothing to show at peek");
            return -1;
        }
        int val = qu.get(0);
        return val;
    }

    public boolean isEmpty() {
        return qu.isEmpty();
    }

    public int size() {
        return qu.size();
    }

    public String toString() {
        return qu.toString();
    }
}