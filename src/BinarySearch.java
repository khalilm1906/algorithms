
public class BinarySearch {
	
	static int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
	      		41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
	
	private static int _doBinarySearch(int[] array, int targetValue) {
		
		int min = 0;
		int max = array.length - 1;
		double guess;
		
		while(max >= min) {
			
			guess = Math.floor((double)((min+max)/2));
			
			if(array[(int)guess] == targetValue) {
				return (int)guess;
			} else if(array[(int)guess] > targetValue) {
				max = (int)guess - 1;
				continue;
			} else {
				min = (int)guess + 1;
				continue;
			}
		}
		

		return -1;	
	}

	public static void main(String[] args) {
		
	
		int result = _doBinarySearch(primes,73);
		System.out.println("result: " + result);

		System.out.println("-----------------------------");
		int result2 = _doBinarySearch(primes,2);
		System.out.println("result2: " + result2);
		
		System.out.println("-----------------------------");
		int result3 = _doBinarySearch(primes,97);
		System.out.println("result3: " + result3);
		
	}

}
