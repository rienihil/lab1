import java.util.Scanner;

public class problem4 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        long startTime = System.nanoTime();
        System.out.println("result: " + factorial(n)+
                "\nruntime: "+ (double)(System.nanoTime() - startTime)/1000000000+
                "\ntime complexity: O(n)");
    }

    /**
     * this method calculates the factorial of the given number
     * it uses a recursive approach
     * time complexity: O(n), where n is the given number
     * the method iterates through numbers from n to 0,
     * resulting in linear time complexity
     *
     * @param n the given number
     * @return the factorial of the given number
     */
    public static int factorial(int n){
        if (n==1 || n==0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
