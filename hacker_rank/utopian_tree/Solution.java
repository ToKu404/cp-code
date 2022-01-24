import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int period[] = new int[n];

        for (int i = 0; i < period.length; i++) {
            period[i] = inp.nextInt();
        }

        checkHeight(period);
        inp.close();
    }

    // My Solution
    private static void checkHeight(int[] period) {
        int max = period[0];
        for (int i = 1; i < period.length; i++) {
            if(max < period[i]){
                max = period[i];
            }
        }

        int height[] = new int[max+1];
        height[0] = 1;
        for (int i = 1; i <= max; i++) {
            if(i%2==0){
                height[i] = height[i-1] + 1;
            }else{
                height[i] = height[i-1] * 2;
            }
        }


        for (int i = 0; i < period.length; i++) {
            System.out.println(height[period[i]]);
        }
    }

    //Best Solution Hackerank
    private static void checkHeight2(int[] period) {
        for (int i = 0; i < period.length; i++) {
            int answer = ~(~1<<(period[i]>>1)) << period[i]%2;
            System.out.println(answer);
        }
    }

    private static void checkHeight3(int[] period) {
        for (int i = 0; i < period.length; i++) {
            int answer = ((int) Math.pow(2, (period[i] + 3) / 2)) + (((int) Math.pow(-1, period[i])) - 3) / 2;
            System.out.println(answer);
        }
    }
}