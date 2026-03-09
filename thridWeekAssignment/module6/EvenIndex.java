package thridWeekAssignment.module6;

public class EvenIndex {
    public static void main(String[] args) {

        int[] arr = {3, 6, 12, 1, 5, 8};

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] % 2 != 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % 2 == 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}