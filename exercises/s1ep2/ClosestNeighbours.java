class ClosestNeighbours {
	public static void main(String[] args){
		int[] numbers = {0, 5, 1209, 6, 2, 111, 112, 33};
		int[] closest = new int[2];
		int min = 100000000;
		for(int i=0; i<numbers.length-1; i++){
			int number1 = numbers[i];
			int number2 = numbers[i+1];
			int distance = Math.abs(number1 - number2);
			if(distance < min){
				min = distance;
				closest[0] = number1;	
				closest[1] = number2;	
			}
		}

		System.out.println("The two closest neighbours are " + closest[0] + " and " + closest[1] + ".");
	}	
}
