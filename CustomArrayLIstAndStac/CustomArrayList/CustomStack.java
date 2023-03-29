package CustomArrayLIstAndStac.CustomArrayList;

public class CustomStack {
    CustomArrayList st;

    CustomStack() {
        st = new CustomArrayList();
    }

    public int pop() {
        if (st.size() < 1) {
            System.out.println("No elements to remove");
            return -1;
        }
        return st.remove();
    }

    public void push(int ele) {
        st.add(ele);
    }

    public int peek() {
        if (st.size() < 1) {
            System.out.println("No elements to remove");
            return -1;
        }
        return st.get(st.size() - 1);
    }

    public boolean isEmpty() {
        return st.isEmpty();
    }

    public int size() {
        return st.size();
    }

    @Override
    public String toString() {
        return st.toString();
    }
}
