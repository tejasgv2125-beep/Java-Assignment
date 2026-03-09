package thridWeekAssignment.module6;

public class DifferenceArray {
    public static void main(String[] args) {

        int n = 6;
        int[] diff = new int[n];

        update(diff, 1, 3, 5);
        update(diff, 2, 4, 3);

        int[] arr = new int[n];
        arr[0] = diff[0];

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + diff[i];
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    static void update(int[] diff, int l, int r, int val) {
        diff[l] += val;
        if (r + 1 < diff.length) {
            diff[r + 1] -= val;
        }
    }
}