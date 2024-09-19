public class Main {
    public static int linearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
       return -1;
    }

    public static void main(String[] args) {
        int[] data = new int[100];
        int toBeFound = 8;
        for(int i=0; i<data.length; i++){
            data[i] = (int) (Math.random() * 11);
            System.out.print(data[i]);
        }
        int index = linearSearch(data, toBeFound);
        if(index == -1){
            System.out.println("\nElement not found");
        } else {
            System.out.println("\nElement found at index " + index);
        }
    }
}