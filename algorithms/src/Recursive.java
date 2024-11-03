public class Recursive {
    public static int factorial(int n){
        if(n < 0){
            return -1;
        }
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static boolean isPalindrome(String word){
        if(word.length() == 1 || word.length() == 2){
            if(word.charAt(0) == word.charAt(word.length()-1)){
                return true;
            }
        }
        if(word.charAt(0) == word.charAt(word.length()-1)){
            return isPalindrome(word.substring(1, word.length()-1));
        }
        return false;
    }
}
