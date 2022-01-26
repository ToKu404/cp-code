import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int starting = inp.nextInt();
        int ending = inp.nextInt();
        int divisor = inp.nextInt();

        beautifulNumber(starting, ending, divisor);
        inp.close();
    }

    private static void beautifulNumber(int starting, int ending, int divisor) {
       int result = 0;
        for (int i = starting; i <= ending; i++) {

            if((i - inversed(i))%divisor == 0){
                result ++;
            }
       }
       System.out.println(result);
    }

    private static int inversed(int i) {
        String num = String.valueOf(i);
        String inv = "";
        for (int j = num.length()-1; j >= 0; j--) {
            inv += num.charAt(j);
        }
        return Integer.valueOf(inv);
    }
}