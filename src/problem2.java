import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("avgOfArr: " + avgOfArr(array, 0, array[0]));
    }

    /**
     * this method returns the average of the array using recursion
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
