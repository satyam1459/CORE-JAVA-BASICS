package Interface.extendDemo;

public interface B extends A {
    // static methods will never get inherited

    // static interface methods should always have a body
    // call via interface name
    static void greeting() {
        System.out.println("Hey I am static method");
    }

    // B extends then B have both A and B functions
    void greet();

}
