// Nasser Alblooshi, 21103356, 784-2007-6290350-6, 04/02/2025
public class RecursiveSum {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};
        int result = sum(numbers, 0, 0); // Starting with index 0 and current sum 0
        System.out.println("Total sum: " + result);
    }

    // Recursive method to calculate the sum of all elements in the array
    // Adding parameters for index and current sum
    public static int sum(int[] array, int index, int currentSum) {
        // Base case: If the array index exceeds the length, return current sum
        if (index >= array.length) {
            return currentSum;
        }

        // Print the current index and sum at each recursive call
        System.out.println("Index: " + index + ", Current Sum: " + currentSum);

        // Recursive case: Add the current element at index to the current sum and move to the next
        return sum(array, index + 1, currentSum + array[index]);
    }
}