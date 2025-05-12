// Nasser Alblooshi, 21103356, 784-2007-6290350-6, 12CAI, 07/02/2025
import java.util.ArrayList;
import java.util.Arrays;

public class RecursiveTraversal {

    // For the string
    public static void traverseString(String str, int index) {
        if (index < str.length()) {
            System.out.println(str.charAt(index));
            traverseString(str, index + 1);
        }
    }

    public static void main(String[] args) {
        // Testing with the provided data
        int[] array = {10, 20, 30, 40};
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        String str = "hello";

        System.out.println("Array elements:");
        traverseArray(array, 0);

        System.out.println("\nArrayList elements:");
        traverseArrayList(list, 0);

        System.out.println("\nString characters:");
        traverseString(str, 0);
    }

    // For the array
    public static void traverseArray(int[] array, int index) {
        if (index < array.length) {
            System.out.println(array[index]);
            traverseArray(array, index + 1);
        }
    }

    // For the ArrayList
    public static void traverseArrayList(ArrayList<String> list, int index) {
        if (index < list.size()) {
            System.out.println(list.get(index));
            traverseArrayList(list, index + 1);
        }
    }
}