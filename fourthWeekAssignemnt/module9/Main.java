//Generate Parentheses
package fourthWeekAssignemnt.module9;

import java.util.*;

public class Main {

    public static void generate(int open, int close, int n, String current, List<String> result) {

        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generate(open + 1, close, n, current + "(", result);
        }

        if (close < open) {
            generate(open, close + 1, n, current + ")", result);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pairs: ");
        int n = sc.nextInt();

        List<String> result = new ArrayList<>();

        generate(0, 0, n, "", result);

        System.out.println("Valid Parentheses:");
        for (String s : result) {
            System.out.println(s);
        }
    }
}