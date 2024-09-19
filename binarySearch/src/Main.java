public class Main {
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
        int[] data = new int[100];
        int toBeFound = 8;
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 11);
            System.out.print(data[i] + " ");
        }
        int index = binarySearch(data, toBeFound);
        if(index == -1){
            System.out.println("\nElement not found");
        } else {
            System.out.println("\nElement found at index " + index);
        }
    }
}