import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n =  inp.nextInt();

        String num[] = new String[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = inp.next();
        }

        findDigits(num);

        inp.close();
    }

    private static void findDigits(String[] num) {
        for (int i = 0; i < num.length; i++) {
            int countDigit = 0;
            int n = Integer.valueOf(num[i].strip().replace(" ", ""));
            for (int j = 0; j < num[i].length(); j++) {
                int digit = Integer.valueOf(num[i].substring(j, j+1));
                if(digit!=0 && n%digit==0){
                    countDigit++;
                }
            }
            System.out.println(countDigit);
        }
    }

    private static void findDigits2(String[] num){
        for (int i = 0; i < num.length; i++) {
            int n = Integer.valueOf(num[i]);
            int r = n;
            int count = 0;
            while(r > 0){
                if(r % 10 != 0 && n % (r % 10) == 0){ 
                    count++;
                };
                r = r / 10;
            }
            System.out.println(count);
        } 
    }
}