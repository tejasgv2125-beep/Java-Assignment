package FirstWeekAssignment.Module2;
import java.util.Scanner;

public class FactorialRecursion {

    static long factorial(long n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        System.out.println("Factorial = " + factorial(num));

        sc.close();
    }
}