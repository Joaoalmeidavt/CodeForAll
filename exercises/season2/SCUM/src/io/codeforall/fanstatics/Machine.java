package io.codeforall.fanstatics;

public class Machine {
    public static void main(String[] args) {
        int result;

        MonoOperation<Integer> increment = (n) -> n+1;
        result = increment.execute(5);
        System.out.println(result);

        BiOperation<Integer> multiply = (n1, n2) -> n1 * n2;
        result = multiply.execute(2, 3);
        System.out.println(result);
    }
}
