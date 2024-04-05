import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("factorial: "+factorial(n));
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
