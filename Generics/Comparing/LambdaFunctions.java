package Generics.Comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        // int[] arr ={ 3,4,53,1};
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            ar.add(i + 1);
        }

        // lambda makes expression one line
        // item contains parameter ,-> sout is the body of function

        // ar.forEach((item) -> System.out.println(item * 2));

        // We can do in consumer type
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        ar.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

}

interface Operation {
    int  operation(int a, int b)

}