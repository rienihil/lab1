import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("minOfArr: " + minOfArr(array, 0, array[0]));
        System.out.println("avgOfArr: " + avgOfArr(array, 0, array[0]));
    }

    /**
     * this method returns the minimum of the array using recursion
     * time complexity: O(n)
     * the method iterates through elements of the array from 0 to n,
     * resulting in linear time complexity
     *
     * @param array the given array
     * @param index the index of the element being compared
     * @param min the current minimum for comparison
     * @return the minimum of the given array
    */
    public static int minOfArr(int[] array, int index, int min){
        if (index == array.length){
            return min;
        }
        else{
            if (min>array[index]){
                min=array[index];
            }
            return minOfArr(array,index+1, min);
        }
    }

    /**
     * this method returns the average of the array using recursion
     * time complexity: O(n)
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