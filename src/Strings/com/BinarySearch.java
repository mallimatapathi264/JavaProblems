package Strings.com;
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 6, 8};
        System.out.println(search(a, 8)); // Output: 4
    }

    public static int search(int[] a, int key) {
        int st = 0;
        int end = a.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Element not found
    }
}
