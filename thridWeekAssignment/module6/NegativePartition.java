package thridWeekAssignment.module6;

public class NegativePartition {
    public static void main(String[] args) {

        int[] arr = {3, -2, 5, -1, 6, -4};

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
