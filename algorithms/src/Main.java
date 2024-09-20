public class Main {
    // Insertion Sort
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  // The element we want to insert
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than the key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert the key in its correct position
            arr[j + 1] = key;
        }
        return arr;
    }

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
       return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Array initialization
        int[] data = new int[20];
        for(int i=0; i<data.length; i++){
            data[i] = (int) (Math.random() * 11);
            System.out.print(data[i] + " ");
        }

        // Element to be found
        int toBeFound = 8;

        // Linear Search
        int index = linearSearch(data, toBeFound);
        if(index == -1){
            System.out.println("\nElement not found");
        } else {
            System.out.println("\nElement found at index " + index);
        }

        // Insertion Sort
        int[] sorted = insertionSort(data);
        for(int i=0; i<sorted.length; i++){
            System.out.print(sorted[i] + " ");
        }

        // Binary Search
        index = binarySearch(data, toBeFound);
        if(index == -1){
            System.out.println("\nElement not found");
        } else {
            System.out.println("\nElement found at index " + index);
        }
    }
}