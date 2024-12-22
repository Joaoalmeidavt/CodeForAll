import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }

    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int[] leftArray = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArray = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;
        while(i < leftArray.length && j < rightArray.length) {
            if(leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while(i < leftArray.length) {
            arr[k++] = leftArray[i++];
        }
        while(j < rightArray.length) {
            arr[k++] = rightArray[j++];
        }

    }

    public static void main(String[] args) {

        int[] arr;

        arr = new int[]{1, 4, 6, 5, 8, 3, 4, 4, 5};
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }


    }

}
