package Generics;

import java.util.*;

public class CustomGenArrayList<T> {

    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0; // size also working as index value

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (this.isFull())
            resize();
        data[size++] = num;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        Object[] temp = new Object[data.length * 2];
        // Copy the current items into temp array

        for (int i = 0; i < data.length; i++)
            temp[i] = data[i];
        // temp will get destroyed after this block
        data = temp;
    }

    public T remove() {
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int idx) {
        return (T) data[idx];
    }

    public int size() {
        return size();
    }

    public void set(int idx, T value) {
        data[idx] = value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < this.size; i++) {
            sb.append(data[i]).append(", ");
        }
        if (sb.length() > 2)
            sb.delete(sb.length() - 2, sb.length());
        sb.append("]");

        return sb.toString();
    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        CustomGenArrayList<String> list = new CustomGenArrayList<>();
        list.add("3");
        list.add("3");
        list.add("2");
        System.out.println(list);

        // for (int i = 0; i < 14; i++) {
        // list.add(2 * i);
        // }
        // System.out.println(list);
    }
}
