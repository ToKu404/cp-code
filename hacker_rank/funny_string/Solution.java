import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
       
        int n = inp.nextInt();
        List<int[]> str = new ArrayList<int[]>(n);
        for (int i = 0; i < n; i++) {
            String text = inp.next();
            int[] strNum = new int[text.length()];
            for (int j = 0; j < strNum.length; j++) {
                strNum[j] = Integer.valueOf(text.charAt(j));
            str.add(i, strNum);
            }
        }
        funnyString(str, n);
        
        inp.close();
    }

    private static void funnyString(List<int[]> str, int n) {
       for (int i = 0; i < n; i++) {
           System.out.println(checkFunny(str.get(i)));
       }
    }

    private static String checkFunny(int[] strNum){
        for (int i = 0; i < Integer.valueOf(strNum.length/2); i++) {
            int left = Math.abs(strNum[i]-strNum[i+1]);
            int right = Math.abs(strNum[strNum.length-(i+1)]- strNum[strNum.length-(i+2)]);
            // System.out.println("left : " + left + "i : "+ strNum[i] + " j : "+strNum[i+1]);
            if(left!=right){
                return "Not Funny";
            }
        }
        return "Funny";
    }
}