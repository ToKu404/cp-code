import java.util.Scanner;

class Solution { 
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String num = inp.nextLine();
        String charNum[] = num.split(" ");
        
        int numeric[] = new int[charNum.length];
        for (int i = 0; i < charNum.length; i++) {
            numeric[i] = Integer.valueOf(charNum[i]);
        }

        minMax(numeric);
        inp.close();
    }

    private static void minMax(int[] numeric) {
        int min = numeric[0], max = numeric[0];
        int indexMax = 0, indexMin = 0;
        for (int i = 1; i < numeric.length; i++) {
            if(min > numeric[i]){
                min = numeric[i];
                indexMin = i;
            }
            if(max < numeric[i]){
                max = numeric[i];
                indexMax = i;
            }
        }

        long maxSum = 0, minSum = 0;
        for (int i = 0; i < numeric.length; i++) {
            
            if(i!=indexMax){
                minSum += numeric[i];
            }
            if(i!=indexMin){
                maxSum += numeric[i];
            }
        }
        System.out.println(minSum +  " " + maxSum);

    }
}