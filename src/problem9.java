import java.util.Scanner;

public class problem9 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bigger number: ");
        int n = sc.nextInt();
        System.out.println("Enter the smaller number: ");
        int k = sc.nextInt();

        long startTime = System.nanoTime();
        System.out.println("result: " + binomialCoef(n, k)+
                "\nruntime: "+ (double)(System.nanoTime() - startTime)/1000000000+
                "\ntime complexity: O(2^n)");
    }

    /**
     * this method calculates the binomial coefficient for a given pair of numbers
     * it uses a recursive approach
     * time complexity: O(2^n), where n is the number k
     * the method branches out each time,
     * resulting in exponential time complexity
     *
     * @param k the first number
     * @param n the second number, has to be smaller than k
     * @return the binomial coefficient
     */
    public static int binomialCoef(int n, int k){
        if (k==n || k==0){
            return 1;
        }
        else{
            return binomialCoef(n-1,k-1)+binomialCoef(n,k-1);
        }
    }
}
