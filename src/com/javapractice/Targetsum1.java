/*package com.javapractice;

import java.util.ArrayList;
import java.util.List;

public class Sortusingquick {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 7, 5, 1};
        int targetsum = 8;
        
        List<Integer> currentCombination = new ArrayList<>();
        findCombinations(a, targetsum, 0, currentCombination);
    }
    
    // This method finds all combinations of indices that sum up to the target value
    public static void findCombinations(int[] a, int targetsum, int start, List<Integer> currentCombination) {
        if (targetsum == 0) {  // Base case: if target sum is reached
            System.out.println(currentCombination);
            return;
        }
        
        for (int i = start; i < a.length; i++) {
            if (a[i] <= targetsum) {
                // Choose the current element by adding its index
                currentCombination.add(i);
                // Recur with the reduced target sum and the next starting index
                findCombinations(a, targetsum - a[i], i + 1, currentCombination);
                // Backtrack to remove the last added index and try the next possibility
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }
}*/
package com.javapractice;

import java.util.ArrayList;
import java.util.List;

public class Targetsum1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 7, 5};
        int targetsum = 8;
        
        List<Integer> currentCombination = new ArrayList<>();
        findCombinations(a, targetsum, 0, currentCombination);
    }
    
    // Recursive function to find all combinations that sum to the target value
    public static void findCombinations(int[] a, int targetsum, int start, List<Integer> currentCombination) {
        // If the target sum is achieved, print the combination
        if (targetsum == 0) {
            System.out.println(currentCombination);
            return;
        }
        
        // Loop through the array starting from 'start' index
        for (int i = start; i < a.length; i++) {
            // If the current element is less than or equal to the remaining target sum
            if (a[i] <= targetsum) {
                // Choose the current element (by adding its index to the combination)
                currentCombination.add(i);
                // Recursively try to find other elements to meet the remaining target sum
                findCombinations(a, targetsum - a[i], i + 1, currentCombination);
                // Backtrack by removing the last added element to explore other possibilities
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }
}

