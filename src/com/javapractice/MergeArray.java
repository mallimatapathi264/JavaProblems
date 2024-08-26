package com.javapractice;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        // Initial arrays
        int[] a = {1, 2, 3, 0, 0, 0};  // Array with extra space for merging
        int[] b = {5, 7, 6}; 
        int[] f = {13, 12, 14, 20, 30, 40};  // Array with extra space for merging
        int[] g = {15, 17, 16}; // Second array
        int[] c = {9, 8};               // Third array
        int[] d = {10, 11};             // Fourth array
        int[] e = {4};                  // Fifth array

        // Merge arrays a and b first
        mergeAndSort(a, b);
        
        // Now merge the result of 'a' with arrays c, d, and e
        int[] result = mergeAndSortMultipleArrays(a, c, d, e,f,g);

        // Output the final sorted merged result
        for (int i : result) {
            System.out.println(i);
        }
    }
    
    // Method to merge 'b' into 'a' and sort the result
    public static void mergeAndSort(int[] a, int[] b) {
        int m = a.length - b.length; // Determine the non-zero elements in 'a'
        for (int i = 0; i < b.length; i++) {
            a[m + i] = b[i];  // Fill in the extra zeros in 'a' with elements of 'b'
        }
        Arrays.sort(a);  // Sort the array after merging
    }
    
    // Method to merge multiple arrays and return the sorted result
    public static int[] mergeAndSortMultipleArrays(int[]... arrays) {
        // Calculate the total length of the final merged array
        int totalLength = 0;
        for (int[] array : arrays) {
            totalLength += array.length;
        }

        // Create a new array to hold all the elements
        int[] result = new int[totalLength];

        // Copy elements from all arrays into 'result'
        int currentIndex = 0;
        for (int[] array : arrays) {
            for (int i = 0; i < array.length; i++) {
                result[currentIndex++] = array[i];
            }
        }

        // Sort the final merged array
        Arrays.sort(result);
        
        return result;
    }
}
