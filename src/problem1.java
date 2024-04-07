import java.util.Scanner;

public class problem1 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        long startTime = System.nanoTime();
        System.out.println("result: " + minOfArr(array, 0, array[0])+
                "\nruntime: "+ (double)(System.nanoTime() - startTime)/1000000000+
                "\ntime complexity: O(n)");
    }

    /**
     * this method returns the minimum of the array
     * it uses a recursive approach
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