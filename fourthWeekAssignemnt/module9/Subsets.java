//Subsets
package fourthWeekAssignemnt.module9;

import java.util.*;
public class Subsets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = new ArrayList<>();

        int total = 1 << n;   // 2^n subsets

        for (int i = 0; i < total; i++) {
            List<Integer> subset = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }

            result.add(subset);
        }

        System.out.println("Subsets are:");
        System.out.println(result);
    }
}