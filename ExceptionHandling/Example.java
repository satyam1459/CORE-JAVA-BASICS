package ExceptionHandling;

//how to create custom Exceptiob

class AgeInvalidException extends Exception {
    AgeInvalidException() {
        // Customize message //Default message
        // super is used to call intermediate parent constructor
        super("Age is invalid");
    }

    AgeInvalidException(String message) {
        super(message);
    }
}

// AgeInvalidException ex = new AgeInvalidException();
// AgeInvalidException ex = new AgeInvalidException("Your age is invalid");
public class Example {
    public static void main(String[] args) {
        System.out.println("Started.."); // starting..
        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println("We have got two numbers >> ");

            int result = n1 / n2;
            System.out.println("Division is " + result);

            if (n2 < 10) {
                // throw new AgeInvalidException();
                throw new AgeInvalidException("My age is invalid");
            }

        } catch (ArithmeticException e) {
            System.out.println("n2 can not be 0 !!");
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            // Java has multiple catch use with one try
            System.out.println("Invalid Numbers !!");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // this is father of all exception and will help to deal with every exception
            System.out.println(" Error idiot user !!");
            System.out.println(e.getMessage());
        } finally {
            // always get executed irrespective of try and catch
            System.out.println("I am in finally block...!!");
            System.out.println("Closing all the resources...!!");
        }
        System.out.println("Terminated..");
    }
}
