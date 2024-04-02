import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        System.out.println(minOfArr(n, array, array[0], 0));
    }

    /**
     * this method returns the minimum of the array using recursion
     * time complexity: O(n)
     * the method iterates through elements of the array from 0 to n,
     * resulting in linear time complexity
     *
     * @param n the size of the array
     * @param array the given array
     * @param min the current minimum for comparison
     * @param index the element being compared
     * @return the minimum of the given array
    */
    public static int minOfArr(int n, int[] array, int min, int index){
        if (index == n){
            return min;
        }
        else{
            if (min>array[index]){
                min=array[index];
            }
            return minOfArr(n, array, min, index+1);
        }
    }

}