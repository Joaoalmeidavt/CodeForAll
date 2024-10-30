package io.codeforall.fanstatics;

public class Machine {
    public static void main(String[] args) {
        // Integers
        int intResult;

        MonoOperation<Integer> increment = (n) -> n + 1;
        intResult = increment.execute(5);
        System.out.println(intResult);

        BiOperation<Integer> multiply = (n1, n2) -> n1 * n2;
        intResult = multiply.execute(2, 3);
        System.out.println(intResult);

        // Strings
        String stringResult;

        MonoOperation<String> toCamelCase = (s) -> {
            String[] temp = s.split(" ");
            for (int i = 0; i < temp.length; i++) {
                Character char0 = temp[i].charAt(0);
                temp[i] = char0.toString().toUpperCase() + temp[i].substring(1, temp[i].length());
            }
            return String.join(" ", temp);
        };
        stringResult = toCamelCase.execute("code for all");
        System.out.println(stringResult);

        BiOperation<String> concatenate = (s1, s2) -> s1 + s2;
        stringResult = concatenate.execute("Code", "ForAll");
        System.out.println(stringResult);


    }
}
