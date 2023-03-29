package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            // int c = a / b;
            // divide(a, b);
            String name = "Kunal";
            if (name.equals("Kunal")) {
                throw new MyException("Name is kunal");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // More strict exception should come below
            System.out.println("Normal exception");
        } finally { // No matter whatever is thrown this will always run
            System.out.println("This will always execute");
        }
        // You cannot create multiple finally block
    }

    // throws --> declare an exception //tells it may throw an exception
    // throw --> we are throwing an exception
    static int divide(int a, int b) throws ArithmeticException {
        // When you explicitly wants to throw some message
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }

}
