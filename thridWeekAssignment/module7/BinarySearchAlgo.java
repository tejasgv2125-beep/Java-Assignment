package thridWeekAssignment.module7;

public class BinarySearchAlgo {

    static int iterative(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    static int recursive(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == key)
            return mid;
        else if (arr[mid] > key)
            return recursive(arr, low, mid - 1, key);
        else
            return recursive(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12};
        int key = 8;

        System.out.println(iterative(arr, key));
        System.out.println(recursive(arr, 0, arr.length - 1, key));
    }
}
