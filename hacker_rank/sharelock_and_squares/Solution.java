import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int num[][] = new int[n][2];
        for (int i = 0; i < num.length; i++) {
            num[i][0] = inp.nextInt();
            num[i][1] = inp.nextInt();
        }
        sharelockSquares(num);

        inp.close();
    }

    private static void sharelockSquares(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            double temp = Math.sqrt(num[i][0]);
            int first = ((int) temp);
            first += temp - first == 0 ? 0 : 1;
            int last = (int) Math.sqrt(num[i][1]);
            System.out.println(last - first + 1);
        }
    }
}