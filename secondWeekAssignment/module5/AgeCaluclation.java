package secondWeekAssignment.module5;

class AgeCalculation {

    static void checkAge(int age) {

        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above.");
        }
        else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);   // Change age to test
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
