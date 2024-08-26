package basicproblems;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    public static Set<Integer> findIntersection(int[] arr1, int[] arr2) {
        // Create a HashSet to store the elements of the first array
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        // Create another HashSet to store the intersection
        Set<Integer> intersection = new HashSet<>();
        for (int num : arr2) {
            // If an element in the second array exists in set1, add it to the intersection set
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection;
    }

    public static void main(String[] args) {
        // Example arrays
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        Set<Integer> intersection = findIntersection(arr1, arr2);
        System.out.println("Intersection of the two arrays: " + intersection);
    }
}
