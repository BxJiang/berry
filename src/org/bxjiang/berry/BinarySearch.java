package org.bxjiang.berry;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, 7, 8, 9, 12, 45, 67, 69, 90};
        System.out.println(search(46, array));

    }

    public static int search(int key, int[] sortedArray) {
        int low = 0;
        int high = sortedArray.length - 1;
        // two indexes (low, high)
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] == key) {
                return mid;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
