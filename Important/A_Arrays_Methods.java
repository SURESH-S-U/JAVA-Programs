import java.util.Arrays;


int[] arr = {2,3,4,3,5,4,4,5};



Arrays.toString(arr)	          //Converts array to a string
Arrays.sort(arr)	              // Sorts array in ascending order
Arrays.fill(arr, value)	          // Fills array with a specific value
Arrays.copyOf(arr, length)	      // Copies an array
Arrays.copyOfRange(arr, start, end)	// Copies a specific range
Arrays.binarySearch(arr, key)	    // Searches for an element in a sorted array
Arrays.equals(arr1, arr2)	        // Compares two arrays
Arrays.asList(arr)	                // Converts an array to a List
Arrays.parallelSort(arr)	        // Sorts an array using multi-threading
Arrays.stream(arr).min().getAsInt()	// Finds the minimum value
Arrays.stream(arr).max().getAsInt()	// Finds the maximum value