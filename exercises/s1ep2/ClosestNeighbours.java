class ClosestNeighbours {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 1209, 6, 2, 111, 112, 33};
        int[] closest = new int[2];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length - 1; i++) {
            int distance = Math.abs(numbers[i] - numbers[i+1]);
            if (distance < min) {
                min = distance;
                closest[0] = numbers[i];
                closest[1] = numbers[i+1];
            }
        }
        System.out.println("The two closest neighbours are " + closest[0] + " and " + closest[1] + ".");
    }
}