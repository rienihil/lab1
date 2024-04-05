import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("gcd: " + gcd(b, a%b));
    }

    /**
     * this method calculates the gcd of 2 numbers
     * it uses a recursive approach
     * time complexity: O(n), where n is the number of divisions
     * the method divides numbers until the remainder is 0,
     * resulting in linear time complexity
     *
     * @param b the number being divided
     * @param c the divisor
     * @return the greatest common denominator
     */
    public static int gcd(int b, int c){
        if (c==0){
            return b;
        }
        else {
            return gcd(c, b%c);
        }
    }
}
