import java.util.Scanner;

public class problem8 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();

        System.out.print("result: ");
        long startTime = System.nanoTime();
        isAllNum(s, 0);
        double runtime = (double)(System.nanoTime() - startTime)/1000000000;
        System.out.println("runtime: "+runtime + "\ntime complexity: O(n)");
    }

    /**
     * this method checks the given string only consists of numbers
     * it uses a recursive approach
     * time complexity: O(n), where n is the size of the string
     * the method iterates through numbers from 0 to n,
     * resulting in linear time complexity
     *
     * @param s the given string
     * @param index the index of the element being checked
     */
    public static void isAllNum(String s, int index){
        if ("0123456789".indexOf(s.charAt(index))==-1){
            System.out.print("No");
        }
        else if (index==s.length()-1){
            System.out.print("Yes");
        }
        else{
            isAllNum(s,index+1);
        }
    }
}
