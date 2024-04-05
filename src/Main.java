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
        primeOrComp(n,n/2);
    }

    /**
     * this method returns the minimum of the array using recursion
     * time complexity: O(n), where n is the size of the array
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

    /**
     * this method prints the average of the array using recursion
     * time complexity: O(n/2), where n is the given number
     * the method iterates through elements of the array from 0 to a,
     * resulting in linear time complexity
     *
     * @param n the given number
     * @param a the number for checking divisibility
     */
    public static void primeOrComp(int n, int a){
        if (a<2){
            System.out.println("Prime "+a);
        }
        else if (n%a==0) {
            System.out.println("Composite "+a);
        }
        else {
            primeOrComp(n, a-1);
        }
    }
}