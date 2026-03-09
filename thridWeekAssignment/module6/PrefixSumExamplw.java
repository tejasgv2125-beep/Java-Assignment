package thridWeekAssignment.module6;

public class PrefixSumExamplw {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int l1 = 1, r1 = 3;
        int l2 = 0, r2 = 4;

        int sum1 = (l1 == 0) ? prefix[r1] : prefix[r1] - prefix[l1 - 1];
        int sum2 = (l2 == 0) ? prefix[r2] : prefix[r2] - prefix[l2 - 1];

        for (int x : prefix) {
            System.out.print(x + " ");
        }

        System.out.println("\nSum from index " + l1 + " to " + r1 + " = " + sum1);
        System.out.println("Sum from index " + l2 + " to " + r2 + " = " + sum2);
    }
}