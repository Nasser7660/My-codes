// Nasser Alblooshi, 21103356, 784-2007-6290350-6, 04/02/2025
public class IterativeSum {
    public static void main(String[] args) {
        int[] numbers =  {5, 10, 15, 20};
        int result = sum(numbers);
        System.out.println("Total sum: " + result);
    }
    public static int sum(int[] array) {
        int currentSum = 0;
        for ( int i = 0; i < array.length; i++) {
            currentSum += array[i];
            System.out.println("Index: " + i + ", Current Sum: " + currentSum);
        }
        return currentSum;
    }
}