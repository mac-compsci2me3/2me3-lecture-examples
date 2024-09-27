package fourthWeek;

public class ChainingExample2 {
    public static void main(String[] args) {
        try {
            performDivision();
        } catch (MyException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause());
        }
    }

    // using the Exception(String message, Throwable cause) constructor
    public static void performDivision() throws MyException {
        try {
            // Simulating an error by dividing by zero (unchecked exception)
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            // Wrapping the original ArithmeticException into a CustomException
            throw new MyException("An error occurred while performing operation", e);
        }
    }

    // Method that causes an ArithmeticException
    public static int divide(int a, int b) {
        return a / b; // This will cause a divide-by-zero exception
    }
}

// Custom exception class that uses Exception(String message, Throwable cause) constructor
class MyException extends Exception {
    public MyException(String message, Throwable cause) {
        // Calling the superclass constructor to pass the message and cause
        super(message, cause); 
        
    }
}