// Nasser Alblooshi, 21103356, 784-2007-6290350-6, 12CAI, 10/02/2025
public class BinarySearchRecursive {
    
    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        // Base case: Target not found
        if (left > right) {
            return -1;
        }
        
        // Find the middle index
        int mid = left + (right - left) / 2;
        
        // Base Case: Target found
        if (array[mid] == target) {
            return mid;
        }
        
        // Recursive case: Search in the left or right half
        if (array[mid] > target) {
            return binarySearchRecursive(array, target, left, mid - 1);
        } else {
            return binarySearchRecursive(array, target, mid + 1, right);
        }
    }
    
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int target = 7;
        int result = binarySearchRecursive(array, target, 0, array.length - 1);
        
        if (result != -1) {
            System.out.println("Number " + target + " found at index: " + result);
        } else {
            System.out.println("Number " + target + " not found.");
        }
    }
}
