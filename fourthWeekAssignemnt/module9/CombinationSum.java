//Combination Sum
package fourthWeekAssignemnt.module9;

import java.util.*;
public class CombinationSum {


    public static void combinationSum(int[] nums, int target, int start,
                                      List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (nums[i] > target) continue;
            current.add(nums[i]);
            combinationSum(nums, target - nums[i], i, current, result);
            current.remove(current.size() - 1);
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
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        List<List<Integer>> result = new ArrayList<>();
        combinationSum(nums, target, 0, new ArrayList<>(), result);
        System.out.println("Combinations are:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
