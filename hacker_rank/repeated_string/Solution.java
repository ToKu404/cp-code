import java.math.BigInteger;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String str = inp.next();
        BigInteger repeat = inp.nextBigInteger();
        

        repeatedString(str, repeat);

        inp.close();
    }

    private static void repeatedString(String str, BigInteger repeat) {
        BigInteger r = repeat.divide(BigInteger.valueOf(str.length()));
        BigInteger containtA = BigInteger.valueOf(0);
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i,i+1).equalsIgnoreCase("a"))
            {
                containtA = containtA.add(BigInteger.ONE);
            }
        }
        containtA = containtA.multiply(r);
    
        int re = repeat.mod(BigInteger.valueOf(str.length())).intValue();
        for (int i = 0; i < re; i++) {
            if(str.substring(i,i+1).equalsIgnoreCase("a"))
            {
                containtA = containtA.add(BigInteger.ONE);
            }
        }
        System.out.println(containtA);
    }
}