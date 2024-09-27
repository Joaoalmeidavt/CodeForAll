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
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i]*2;
        }
        return array;
    }

    public int factorialIterative(int n){
       int result = 1;
       for(int i = 1; i <= n; i++) {
          result *= i;
       }
       return result;
    }

    public int factorialRecursive(int n){
        if(n == 0) {
            return 1;
        }
        return n * factorialRecursive(n-1);
    }
}
