import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("fibonacci: " + fibonacci(n));
    }

    /**
     * this method calculates the n-th element of the fibonacci sequence
     * it uses a recursive approach
     * time complexity: O(2^n), where n is the given number
     * the method branches out each time,
     * resulting in exponential time complexity
     *
     * @param n the given number
     * @return n-th element of the fibonacci sequence
     */
    public static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        }
        else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
