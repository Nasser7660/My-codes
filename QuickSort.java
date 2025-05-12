// Nasser Alblooshi, 21103356, 784-2007-6290350-6, 12CAI, 10/02/2025
public class QuickSort {

	public static void main(String[] args) {
		int [] array = {9, 2, 5, 6, 1, 3, 4, 8, 7}; // Example array
		System.out.println("Original Array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();

		quickSort(array, 0, array.length - 1);

		System.out.println("Sorted Array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	public static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(array, low, high);
			quickSort(array, low, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, high);
		}
	}

	public static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;
		
		for (int j = low; j < high; j++) {
		    if (array[j] <= pivot) {
		        i++;
		        swap(array, i, j);
		    }
		}
		
		swap (array, i + 1, high);
		return i + 1;
	}
	
	public static void swap(int[] array, int i, int j) {
	    int temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	}
}