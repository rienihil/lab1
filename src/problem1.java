import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("minOfArr: " + minOfArr(array, 0, array[0]));
    }

    /**
     * this method returns the minimum of the array using recursion
     * time complexity: O(n), where n is the size of the array
     * the method iterates through elements of the array from 0 to n,
     * resulting in linear time complexity
     *
     * @param array the given array
     * @param index the index of the element being compared
     * @param min   the current minimum for comparison
     * @return the minimum of the given array
     */
    public static int minOfArr(int[] array, int index, int min) {
        if (index == array.length) {
            return min;
        } else {
            if (min > array[index]) {
                min = array[index];
            }
            return minOfArr(array, index + 1, min);
        }
    }
}