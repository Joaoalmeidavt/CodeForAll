package io.codeforall.bootcamp.exercise;
public class Playground {
    public static void main(String[] args) {
        io.codeforall.bootcamp.exercise.Ai ai = new io.codeforall.bootcamp.exercise.Ai("28/09/2024", "Jacob");

        // getCreationDate method example
        System.out.println("getCreationDate method example");
        System.out.println(ai.getCreationDate());

        // setCreationDate method example
        System.out.println("setCreationDate method example");
        ai.setCreationDate("29/09/2024");
        System.out.println(ai.getCreationDate());

        // getName method example
        System.out.println("getName method example");
        System.out.println(ai.getName());

        // setName method example
        System.out.println("setName method example");
        ai.setName("Tigran");
        System.out.println(ai.getName());

        // doubleArray method example
        System.out.println("doubleArray method example");
        int[] arr = new int[]{1, 2, 3, 4};
        arr = ai.doubleArray(arr);
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println("");

        // factorialIterative method example
        System.out.println("factorialIterative method example");
        System.out.println(ai.factorialIterative(5));

        // factorialRecursive method example
        System.out.println("factorialRecursive method example");
        System.out.println(ai.factorialRecursive(5));

        // palindromeReplace method example
        System.out.println("palindromeReplace method example ");
        System.out.println(ai.palindromeReplace("anotaramadatadamaratona miguel rito"));

        // emailValidator method example
        System.out.println("emailValidator method example ");
        System.out.println(ai.emailValidator());
    }
}