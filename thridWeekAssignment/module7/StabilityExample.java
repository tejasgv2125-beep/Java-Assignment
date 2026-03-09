package thridWeekAssignment.module7;

class Item {
    int key;
    String name;

    Item(int key, String name) {
        this.key = key;
        this.name = name;
    }
}

public class StabilityExample {

    static void bubbleSort(Item[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j].key > arr[j + 1].key) {
                    Item temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Item[] arr = {
                new Item(2, "A"),
                new Item(1, "B"),
                new Item(2, "C"),
                new Item(1, "D")
        };

        bubbleSort(arr);

        for (Item i : arr) {
            System.out.println(i.key + " " + i.name);
        }
    }
}
