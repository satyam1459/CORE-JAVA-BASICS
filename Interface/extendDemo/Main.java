package Interface.extendDemo;

public class Main implements B {

    @Override
    public void fun() {

    }

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();

        // static method call via interface name.
        B.greeting();
    }

}

// Annotations is internally an interface
