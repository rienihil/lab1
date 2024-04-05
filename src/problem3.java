import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        primeOrComp(n,n/2);
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
