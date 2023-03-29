package Singelton.Singelton;

// public class Eager {
//    //1) Eager initialisation  --> we create obj as soon as class is creater
//    //Object is created as soon as class loaded in memory, whether it's needed or not
//    //no exception handling
//     private static final Eager eager = new Eager();

//     public static Eager getInstance() {
//         return eager;
//     }

//     private Eager() {

//     }
// }

//Method 2)--> SubEager process
//Step--2) Using static block
// //Can use Exception Handling
// public class Eager {

//     public static final Eager eager;

//     private Eager() {

//     }

//     // static block--> Object creation is done in static block
//     static {
//         // We can use try - catch here because try catch can be only used inside block
//         eager = new Eager();
//     }

//     // public static Eager eager() {
//     // return null;
//     // }

// }

//3--> Lazy Initialisation
//Object is created on demand
//Exception Handling
//In multi-threading enironment it can create two new object at same time if both are null
// public class Eager {
//     private static Eager eager;

//     private Eager() {

//     }
//     public static Eager getObject() {
//         if (eager == null) {
//             eager = new Eager();
//         }
//         return eager;
//     }
// }

// // 4) --> Lazy Initialisation in multi threading environment
// //Degrade performance

// public class Eager {
//     private static Eager eager;

//     private Eager() {

//     }
//     synchronized public static Eager getObject() {
//         if (eager == null) {
//             eager = new Eager();
//         }
//         return eager;
//     }
// }

// 5) --> Lazy Initialisation in multi threading environment with improved performance or double checking

public class Eager {
    private static Eager eager;

    private Eager() {

    }

    // We should apply double checking
    public static Eager getObject() {
        if (eager == null) {
            synchronized (Eager.class) {
                if (eager == null) {
                    eager = new Eager();
                }
            }
            eager = new Eager();
        }
        return eager;
    }
}
