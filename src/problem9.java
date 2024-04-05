import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println("binomialCoef: " + binomialCoef(n, k));
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
