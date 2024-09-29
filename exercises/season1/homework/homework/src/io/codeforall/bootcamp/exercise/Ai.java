package io.codeforall.bootcamp.exercise;
public class Ai {
    private String creationDate;
    private String name;

    public Ai(String creationDate, String name) {
        this.creationDate = creationDate;
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] doubleArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * 2;
        }
        return result;
    }

    public int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    private boolean isPalindrome(String word) {
        if (word.length() == 1 || word.length() == 2) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                return true;
            }
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return isPalindrome(word.substring(1, word.length() - 1));
        }
        return false;
    }

    public String palindromeReplace(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(isPalindrome(words[i])) {
                words[i] = "palindrome";
            }
        }
        return String.join(" ", words);
    }

    //public String palindromeReplace(String str) {
    //    String result = str;
    //    int i = 0;
    //    int j = str.length();
    //    int J = j;
    //    while (j > i + 1) {
    //        while (j > i + 1) {
    //            String sub = str.substring(i, j);
    //            if (isPalindrome(sub)) {
    //                result = result.replaceAll(sub, "palindrome");
    //                i = j;
    //            }
    //            j--;
    //        }
    //        J--;
    //        j = J;
    //    }
    //    return result;
    //}

    public String emailValidator() {
        return "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    }


}
