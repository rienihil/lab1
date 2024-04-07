import java.util.Scanner;

public class problem5 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        long startTime = System.nanoTime();
        System.out.println("result: " + fibonacci(n)+
                "\nruntime: "+ (double)(System.nanoTime() - startTime)/1000000000+
                "\ntime complexity: O(2^n)");
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
