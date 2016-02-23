
public class LinearSearch {
	
	static int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
      		41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
	
	private static int _doLinearSearch(int[] array, int targetValue) {
		
		for(int guess = 0 ; guess < array.length ; guess++ ) {
			if(array[guess] == targetValue) {
				return guess;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int targetValue = 97;
		int result = _doLinearSearch(primes, targetValue);
		System.out.println("Target Value " + targetValue + 
				((result != -1) ? " found at index: " + result : " not found."));
		
		
	}

}
