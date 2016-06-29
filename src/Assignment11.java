
/**
 * Assignment 11, due on 06.07.2016
 * @author Jan Kulose, s0557320@htw-berlin.de
 *
 */
public class Assignment11 {
	/**
	 * Linearly searches the given array for the given value. Returns -1 if not found.
	 * @param a given array
	 * @param search value to be searched for
	 * @return index of array that has the given value, -1 if not found
	 */
	public static int linSearch(int[] a, int search) {
		// if array object is null return -1
		if (a == null) {
			return -1;
		}
		// go through every array index and check for same value as searched value
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				return i;
			}
		}
		// return -1 if nothing found
		return -1;
	}
	
	/**
	 * Linearly searches the given array for the given value. Returns -1 if not found.
	 * @param a given array
	 * @param search value to be searched for
	 * @return index of array that has the given value, -1 if not found
	 */
	public static int linSearch(double[] a, double search) {
		// if array object is null return -1
		if (a == null) {
			return -1;
		}
		// go through every array index and check for same value as searched value
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				return i;
			}
		}
		// return -1 if nothing found
		return -1;
	}
	
	/**
	 * Binary searches the given array for the given value. Returns -1 if not found.
	 * @param a given array
	 * @param search value to be searched for
	 * @return index of array that has the given value, -1 if not found
	 */
	public static int binSearchIter(int[] a, int search) {
		// catching null
		if (a == null) {
			return -1;
		}
		// setting start, end and middle search-area values
		int start = 0,
			end = a.length-1,
			middle = (start+end)/2;
		/*
		 * Checking if array value of middle index is equal, smaller or bigger than searched value.
		 * If equal, return middle as index.
		 * If bigger, search in the area below the current index
		 * If smaller, search in the area above the current index
		 * break loop if no remaining not searched index remaining
		 */
		while (a[middle] != search && !(start == end)) {
			if (a[middle] > search) {
				end = middle-1;
			} else if (a[middle] < search) {
				start = middle+1;
			}
			middle = (start+end)/2;
		}
		// if found return index, otherwise return -1
		if (a[middle] == search) {
			return middle;
		} else {
			return -1;
		}
	}
	
	/**
	 * Binary searches the given array for the given value. Returns -1 if not found.
	 * @param a given array
	 * @param search value to be searched for
	 * @return index of array that has the given value, -1 if not found
	 */
	public static int binSearch(int[] a, int search) {
		// catching null
				if (a == null) {
					return -1;
				}
		// starting recursive search with start and end parameters added
		return binSearch(a, search, 0, a.length-1);
	}
	
	private static int binSearch(int[] a, int search, int start, int end) {
		// setting new middle value
		int middle = (start+end)/2;
		/*
		 * Checking if array value of middle index is equal, smaller or bigger than searched value.
		 * If equal, return middle as index.
		 * If bigger, call method with updated search area below current index
		 * If smaller, call method with updated search area above current index
		 * If not equal AND no remaining not searched index remaining, stop recursive calling and return -1
		 */
		if (a[middle] == search) {
			return middle;
		} else if (a[middle] > search && !(start == end)) {
			return binSearch(a, search, start, middle-1);
		} else if (a[middle] < search && !(start == end)) {
			return binSearch(a, search, middle+1, end);
		} else {
			return -1;
		}
	}
}
