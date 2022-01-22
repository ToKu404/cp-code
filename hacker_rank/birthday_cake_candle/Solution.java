import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp  = new Scanner(System.in);
        int age = inp.nextInt();
        int candle[] = new int[age];
        for (int i=0;i<age;i++){
            candle[i] = inp.nextInt();
        }
        int result = countTallestCandle(candle);
        System.out.println(result);
        inp.close();
    }

    public static int countTallestCandle(int candle[]){
        int tallest = candle[0];
        int count = 1;
        for (int i = 1; i < candle.length; i++) {
            if (candle[i] > tallest){
                count = 1;
                tallest = candle[i];
            }
            else if (candle[i] == tallest){
                count ++;
            }
        }
        return count;
    }
}