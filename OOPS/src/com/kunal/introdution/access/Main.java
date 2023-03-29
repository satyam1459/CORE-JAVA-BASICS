package OOPS.src.com.kunal.introdution.access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"Kunal");
    //need to do a few things
    //1. access  the data members
    //2. modify the data members

//        ArrayList<Integer> list = new ArrayList<>();
//        list.DEFAULT_CAPACITY;
        System.out.println(obj.getNum());
        obj.setNum(5);
        System.out.println(obj.getNum());
    }
}
