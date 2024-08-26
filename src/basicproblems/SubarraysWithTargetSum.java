package basicproblems;
import java.util.ArrayList;
import java.util.List;
public class SubarraysWithTargetSum {

    public static void printSubarraysWithTargetSum(int[] array, int targetSum) {
        for (int start = 0; start < array.length; start++) {
            int currentSum = 0;

            for (int end = start; end < array.length; end++) {
                currentSum += array[end];

                if (currentSum == targetSum) {
                    // Print the subarray directly
                    for (int k = start; k <= end; k++) {
                        System.out.print(array[k] + " ");
                    }
                    System.out.println();  // Newline for each subarray
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 4, -7, 1, 3, 3, 1, -4};
        int targetSum = 7;
        printSubarraysWithTargetSum(array, targetSum);
    }
}
/*package basicproblems;

import java.util.ArrayList;
import java.util.List;

public class SubarraysWithTargetSum {

    public static List<List<Integer>> printSubarraysWithTargetSum(int[] array, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();

        for (int start = 0; start < array.length; start++) {
            int currentSum = 0;
            List<Integer> subarray = new ArrayList<>();

            for (int end = start; end < array.length; end++) {
                currentSum += array[end];
                subarray.add(array[end]);

                if (currentSum == targetSum) {
                    result.add(new ArrayList<>(subarray));  // Add a copy of the subarray
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, -7, 1, 3, 3, 1, -4};
        int targetSum = 7;
        List<List<Integer>> subarrays = printSubarraysWithTargetSum(array, targetSum);

        for (List<Integer> subarray : subarrays) {
            System.out.println(subarray);
        }
    }
}
*/