import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();

        int num[] = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = inp.nextInt();
        }

        plusMinus(num);

        inp.close();
    }

    private static void plusMinus(int[] num) {
        double positive = 0.0, negative = 0.0, zero = 0.0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]>0){
                positive++;
            }else if(num[i]<0){
                negative++;
            }else{
                zero++;
            }
        }

        System.out.println(positive/num.length);
        System.out.println(negative/num.length);
        System.out.println(zero/num.length);

    }
}