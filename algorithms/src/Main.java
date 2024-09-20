public class Main {
    public static void printArr(int[] arr){
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // Array initialization
        int[] data = new int[20];
        for(int i=0; i<data.length; i++){
            data[i] = (int) (Math.random() * 11);
        }

        // Element to be found
        int toBeFound = 8;

        // Linear Search
        Search ls = new Search();
        System.out.println("Linear Search\n");
        System.out.print("Data: ");
        printArr(data);

        System.out.println("Value: " + toBeFound);
        int index = ls.linearSearch(data, toBeFound);
        if(index == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }

        // Selection Sort
        Sort ss = new Sort();
        System.out.println("\nSelection Sort\n\nData:");
        printArr(data);
        System.out.println("Sorted:");
        int[] sorted = ss.selectionSort(data);
        printArr(sorted);

        // Insertion Sort
        Sort is = new Sort();
        System.out.println("\nInsertion Sort\n\nData:");
        printArr(data);
        sorted = is.insertionSort(data);
        System.out.println("Sorted:");
        printArr(sorted);

        // Binary Search
        Search bs = new Search();
        System.out.println("\nBinary Search");
        System.out.println("Data: ");
        printArr(data);
        index = bs.binarySearch(data, toBeFound);
        if(index == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}