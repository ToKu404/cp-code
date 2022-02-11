import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int lowerLimit = inp.nextInt();
        int upperLimit = inp.nextInt();

        kaprekarNumber(lowerLimit, upperLimit);

        inp.close();
    }

    private static void kaprekarNumber(int lowerLimit, int upperLimit) {
        boolean isEmpty = true;
        for (int i = lowerLimit; i < upperLimit+1; i++) {
            String num = String.valueOf((long)i*i);
            String left = num.substring(0, num.length()/2);
            String right = num.substring((num.length())/2, num.length());


            int leftNum = (left.isEmpty())  ? 0 : Integer.parseInt(left);
            int rightNum = (right.isEmpty()) ? 0 : Integer.parseInt(right);

            if(leftNum + rightNum == i){
                System.out.print(i + " ");
                if(isEmpty){
                    isEmpty = false;
                }
            }
        }

        if(isEmpty){
            System.out.println("INVALID RANGE");
        }
    }
}