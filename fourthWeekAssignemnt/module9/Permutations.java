//Permutations
package fourthWeekAssignemnt.module9;

import java.util.*;

public class Permutations {
    public static void permute(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            current.add(nums[i]);
            permute(nums, used, current, result);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, new boolean[n], new ArrayList<>(), result);
        System.out.println("Permutations are:");
        for (List<Integer> p : result) {
            System.out.println(p);
        }
    }
}
