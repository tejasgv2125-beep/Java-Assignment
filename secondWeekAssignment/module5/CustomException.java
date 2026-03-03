package secondWeekAssignment.module5;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {

    // Method using throws keyword
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            // throw keyword
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);   // Change value to test
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}