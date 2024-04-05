import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("power: " + power(a,n));
    }

    /**
     * this method calculates the given number to the given power
     * it uses a recursive approach
     * time complexity: O(n), where n is the given power
     * the method iterates through numbers from n to 0,
     * resulting in linear time complexity
     *
     * @param a the given number
     * @param n the given power
     * @return the given number to the given power
     */
    public static int power(int a, int n){
        if (n==0){
            return 1;
        }
        else if (n==1){
            return a;
        }
        else{
            return a*power(a,n-1);
        }
    }
}
