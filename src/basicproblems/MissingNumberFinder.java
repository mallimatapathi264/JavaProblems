package basicproblems;

public class MissingNumberFinder {

    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the sum of the first n natural numbers
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate the sum of the elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // The missing number is the difference between expectedSum and actualSum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // Example array with a missing number
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6; // The array should have numbers from 1 to 6
        
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
