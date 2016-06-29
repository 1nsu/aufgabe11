
/**
 * Assignment 11, due on 06.07.2016
 * @author Jan Kulose, s0557320@htw-berlin.de
 * Testclass
 */
public class Assignment11Test {
	public static void main(String[] args) {
		int[] intArrayTest = {2,4,6,8,10,12,14,16}, // Test array to search through
			  lookingFor = {1, 2, 6, 11, 16, 17}; // Values to search for
		
		// trying to feed null as array
		Assignment11.linSearch(null, 1L);
		Assignment11.binSearch(null, 0);
		Assignment11.binSearchIter(null, 0);
		
		// search for every value that we look for in the test array via the different search methods
		for (int i = 0; i < lookingFor.length; i++) {
			System.out.println("Searching for value (" + lookingFor[i] + ")");
			if (Assignment11.linSearch(intArrayTest, lookingFor[i]) >= 0) {
				System.out.println("Linear search Algorithm:\n    Value (" +
									intArrayTest[Assignment11.linSearch(intArrayTest, lookingFor[i])] +
									") found at index [" + Assignment11.linSearch(intArrayTest, lookingFor[i]) + "]");
			} else {
				System.out.println("Linear search Algorithm:\n    Value not found.");
			}
			
			if (Assignment11.binSearch(intArrayTest, lookingFor[i]) >= 0) {
				System.out.println("Recursive binary search Algorithm:\n    Value (" +
									intArrayTest[Assignment11.binSearch(intArrayTest, lookingFor[i])] +
									") found at index [" + Assignment11.binSearch(intArrayTest, lookingFor[i]) + "]");
			} else {
				System.out.println("Recursive binary search Algorithm:\n    Value not found.");
			}
			
			if (Assignment11.binSearchIter(intArrayTest, lookingFor[i]) >= 0) {
				System.out.println("Iterative binary search Algorithm:\n    Value (" +
									intArrayTest[Assignment11.binSearchIter(intArrayTest, lookingFor[i])] +
									") found at index [" + Assignment11.binSearchIter(intArrayTest, lookingFor[i]) + "]");
			} else {
				System.out.println("Iterative binary search Algorithm:\n    Value not found.");
			}
			System.out.println();
		}

	}
}
