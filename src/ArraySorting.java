import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        Arrays.sort(numbers);
        System.out.print("Sorted Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
//This code defines a class named "ArraySorting" with a "main" method. Inside the "main" method, an integer array called "numbers" is declared and initialized with values {5, 2, 8, 1, 9}. The Arrays.sort() method is then used to sort the elements of the "numbers" array in ascending order. After sorting, the sorted array is printed to the console using a for-each loop, displaying the elements in ascending order. The output of this code will be "Sorted Array: 1 2 5 8 9," which represents the sorted version of the original array.
