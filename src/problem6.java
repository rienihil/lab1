import java.util.Scanner;

public class problem6 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        System.out.println("Enter the power: ");
        int n = sc.nextInt();

        long startTime = System.nanoTime();
        System.out.println("result: " + power(a, n)+
                "\nruntime: "+ (double)(System.nanoTime() - startTime)/1000000000+
                "\ntime complexity: O(n)");
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
