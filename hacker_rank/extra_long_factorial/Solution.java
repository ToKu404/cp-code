import java.math.BigInteger;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int factor = inp.nextInt();

        extraLongFactorial(factor);
        inp.close();
    }

    private static void extraLongFactorial(int factor) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 2; i <= factor; i++) {
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}