package CustomArrayLIstAndStac.CustomArrayList;

public class Main {
    public static void main(String[] args) {
        // CustomStack stack = new CustomStack();
        // stack.push(33);
        // System.out.println(stack);
        // System.out.println(stack.pop());
        // System.out.println(stack);
        // stack.push(22);
        // stack.push(32);
        // stack.push(442);
        // stack.push(242);
        // System.out.println(stack.size());
        // System.out.println(stack.isEmpty());
        // System.out.println(stack.peek());
        // System.out.println(stack);
        // stack.push(22);
        // stack.push(32);
        // stack.push(442);
        // stack.push(242);
        // stack.push(22);
        // stack.push(32);
        // stack.push(442);
        // stack.push(242);
        // System.out.println(stack.size());

        CustomQueue qu = new CustomQueue();
        qu.add(7);
        qu.add(13);
        qu.add(22);
        System.out.println(qu);
        qu.pop();
        System.out.println(qu.peek());
        System.out.println(qu);
        System.out.println(qu.size());
        System.out.println(qu.peek());
    }
}
