import java.util.Scanner;

/**
 * Solution
 */
public class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int n = inp.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = inp.nextInt();
        }
        gradingStudents(num);
        inp.close();
    }

    private static void gradingStudents(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if(num[i]>=38 && num[i]%5>=3){
                num[i] += 5-num[i]%5; 
            }
            System.out.println(num[i]);
        }
    }
}