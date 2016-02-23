
import java.time.LocalDateTime;
import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] array = {12,8,7,5,2};
		int temp;
		
		System.out.println("Array Before Sort: " + Arrays.toString(array));
		
		LocalDateTime start = LocalDateTime.now();
		
		System.out.println("finished: " + start);
		
		for(int i = 0 ; i < array.length-1 ; i++) {
				
			for(int j = 0 ; j < array.length-1-i ; j++) {
				
				if(array[j] > array[j+1]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		LocalDateTime stop = LocalDateTime.now();
		
		System.out.println("finished: " + stop);
		
		System.out.println("Array After Sort: " + Arrays.toString(array));

	}

}
