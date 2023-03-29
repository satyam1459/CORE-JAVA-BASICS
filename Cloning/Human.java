package Cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] ar;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.ar = new int[] { 2, 3, 4, 5, 6 };
    }

    // public Human(Human other) {
    // this.age = other.age;
    // this.name = other.name;
    // }

    // @Override
    // public Object clone() throws CloneNotSupportedException {
    // //this is shallow copy
    // return super.clone();
    // }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // this is deep copy
        Human twin = (Human) super.clone(); // this is actually a shallow copy

        // Make a deep copy
        twin.ar = new int[twin.ar.length];
        for (int i = 0; i < twin.ar.length; i++) {
            twin.ar[i] = this.ar[i];
        }
        return twin;
    }

}
