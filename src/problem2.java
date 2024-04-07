
import java.util.Scanner;

public class problem2 {
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
        System.out.println("result: " + avgOfArr(array, 0, array[0])+
                "\nruntime: "+ (double)(System.nanoTime() - startTime)/1000000000+
                "\ntime complexity: O(n)");
    }

    /**
     * this method returns the average of the array
     * it uses a recursive approach
     * time complexity: O(n), where n is the size of the array
     * the method iterates through elements of the array from 0 to n,
     * resulting in linear time complexity
     *
     * @param array the given array
     * @param index the index of the current element
     * @param sum the sum of elements up to index
     * @return the average of the given array
     */
    public static double avgOfArr(int[] array, int index, double sum){
        if (index+1 == array.length){
            return sum/array.length;
        }
        else{
            return avgOfArr(array, index+1, sum+array[index+1]);
        }
    }
}
