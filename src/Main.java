import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(
                """
                        1. Minimum of an array
                        2. Average of an array
                        3. Prime or composite
                        4. Factorial
                        5. Fibonacci
                        6. Power
                        7. Reverse an array
                        8. Check if all digits
                        9. Binomial coefficient
                        10. Greatest common denominator
                        Pick a function:""");
        int pick = sc.nextInt();
        switch(pick){
            case 1:
                problem1.run();
                break;
            case 2:
                problem2.run();
                break;
            case 3:
                problem3.run();
                break;
            case 4:
                problem4.run();
                break;
            case 5:
                problem5.run();
                break;
            case 6:
                problem6.run();
                break;
            case 7:
                problem7.run();
                break;
            case 8:
                problem8.run();
                break;
            case 9:
                problem9.run();
                break;
            case 10:
                problem10.run();
                break;
        }
    }
}
