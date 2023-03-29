package Access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Kunal");
        // need to do a few things
        // 1. Access the data members
        // 2. Modify the data members
        ArrayList<Integer> list = new ArrayList<>();
        // list.DEFAULT_CAPACITY=20; //cannot change as it is private

        // Public access will be allowed anywhere
        // Private in only within the class
        // Default only in that package accessible.
        // Protected will be acceseed in the same class , package subclass of same
        // package,subclass in different package

    }

}
