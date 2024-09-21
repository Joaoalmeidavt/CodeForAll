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
        int[] ogData = new int[20];
        for(int i=0; i<data.length; i++){
            data[i] = (int) (Math.random() * 11);
        }
        ogData = data.clone();

        // Element to be found
        int toBeFound = 8;

        // Linear Search
        System.out.println("Linear Search\n");
        System.out.print("Data: ");
        printArr(data);

        System.out.println("Value: " + toBeFound);
        int index = Search.linearSearch(data, toBeFound);
        if(index == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }

        // Selection Sort
        System.out.println("\nSelection Sort\n\nData:");
        printArr(data);
        System.out.println("Sorted:");
        int[] sorted = Sort.selectionSort(data);
        printArr(sorted);

        // Insertion Sort
        System.out.println("\nInsertion Sort\n\nData:");
        printArr(ogData);
        sorted = Sort.insertionSort(ogData);
        System.out.println("Sorted:");
        printArr(sorted);

        // Binary Search
        System.out.println("\nBinary Search");
        System.out.println("Data: ");
        printArr(data);
        index = Search.binarySearch(data, toBeFound);
        if(index == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }

        // Factorial
        int n = 4;
        int fact = Recursive.factorial(n);
        System.out.println("\nFactorial of " + n + " is " + fact + "\n");

        // Palindrome
        String word = "ANA";
        if(Recursive.isPalindrome(word)){
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        word = "NOT";
        if(Recursive.isPalindrome(word)){
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        // Binary Trees
        System.out.println("\nBinary Trees");
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(0); // Initialize the root node
        tree.addNode(tree.root, 1);
        tree.addNode(tree.root, 2);
        tree.addNode(tree.root, 3);
        tree.addNode(tree.root, 4);

        System.out.print("BFS: ");
        tree.BFS(tree.root); // Pass the root node
        System.out.println("");
        System.out.print("DFS: ");
        tree.DFS(tree.root); // Pass the root node
    }
}