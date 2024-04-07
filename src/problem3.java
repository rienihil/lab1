import java.util.Scanner;

public class problem3 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.print("result: ");
        long startTime = System.nanoTime();
        primeOrComp(n,n/2);
        double runtime = (double)(System.nanoTime() - startTime)/1000000000;
        System.out.println("runtime: "+runtime + "\ntime complexity: O(n/2)");
    }

    /**
     * this method checks if the given number is prime of composite
     * it uses a recursive approach
     * time complexity: O(n/2), where n is the given number
     * the method iterates through numbers from n/2 to 1,
     * resulting in linear time complexity
     *
     * @param n the given number
     * @param a the number for checking divisibility
     * the method prints "Prime" or "Composite"
     */
    public static void primeOrComp(int n, int a){
        if (a<2){
            System.out.println("Prime");
        }
        else if (n%a==0) {
            System.out.println("Composite");
        }
        else {
            primeOrComp(n, a-1);
        }
    }
}
