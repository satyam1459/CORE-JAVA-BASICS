class A {
    public void show() {
        System.out.println("1");
        return;
    }
}

class B extends A {
    public void show() {
        System.out.println("2");
        return;
    }
}

public class inherit {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }

}
