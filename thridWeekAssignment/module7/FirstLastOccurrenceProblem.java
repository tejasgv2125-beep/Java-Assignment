package thridWeekAssignment.module7;

public class FirstLastOccurrenceProblem {

    static int first(int[] arr, int x) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return result;
    }

    static int last(int[] arr, int x) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3,4};
        int x = 2;

        System.out.println("First: " + first(arr, x));
        System.out.println("Last: " + last(arr, x));
    }
}