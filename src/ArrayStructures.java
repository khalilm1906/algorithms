
public class ArrayStructures {
	
	
	private int[] theArray = new int[50];
	
	private int arraySize = 10;
	
	public void generateRandomArray() {
		for(int i = 0 ; i < arraySize ; i++) {
			
			theArray[i] = (int)(Math.random()*10)+10;
			
		}
	}
	
	public void printArray() {
		
		System.out.println("----------");
		for(int i = 0 ; i < arraySize ; i++) {
			
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " | ");
			
			System.out.println("----------");
		}
		
		
	}
	
	public int getValueAtIndex(int index) {
		if(index < arraySize) return theArray[index];
		
		return 0;
	}
	
	public boolean doesArrayContainnThisValue(int searchValue) {
		
		boolean valueInArray = false;
		
		for(int i = 0 ; i < arraySize ; i++) {
			
			if(theArray[i] == searchValue) {
				valueInArray = true;
			}
		}
		
		return valueInArray;
	}
	
	public void deletIndex(int index) {
		
		if(index < arraySize) {
			for(int i = index ; i < (arraySize-1) ; i++ ) {
				theArray[i] = theArray[i+1];
			}
			arraySize--;
		}

	}
	
	public static void main(String[] args){
		
		ArrayStructures as = new ArrayStructures();
		
		as.generateRandomArray();
		
		as.printArray();
		
		int valueAtIndex = 5;
		
		System.out.println("Value at index " + valueAtIndex + 
				" is " + as.getValueAtIndex(3) + ".");
		
		int searchValue = 10;
		
		System.out.println("Does " + searchValue + " exists in array? " + 
				as.doesArrayContainnThisValue(searchValue));
		
		int deleteIndex = 5;
		
		as.deletIndex(deleteIndex);
		
		System.out.println("Deleted " + deleteIndex + "th index.");
		
		as.printArray();

	}

}
