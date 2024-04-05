import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.print("isAllNum: ");
        isAllNum(s, 0);
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
