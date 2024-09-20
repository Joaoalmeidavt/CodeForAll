public class Sort {
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

    // Selection Sort
    public static int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int place = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    place = j;
                }
            }
            arr[place] = arr[i];
            arr[i] = min;
        }
        return arr;
    }
}
