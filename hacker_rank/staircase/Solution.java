import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();

        staircase(n);

        inp.close();
    }

    private static void staircase(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = n; j >= 1; j--) {
                if(i>=j){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}