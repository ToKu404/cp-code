import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int budget = inp.nextInt();
        int n = inp.nextInt();
        int m = inp.nextInt();

        Integer keyboards[] = new Integer[n];
        Integer mouse[] = new Integer[m];

        for (int i = 0; i < keyboards.length; i++) {
            keyboards[i] = inp.nextInt();
        }

        for (int i = 0; i < mouse.length; i++) {
            mouse[i] = inp.nextInt();
        }

        electronicShop(budget, keyboards, mouse);
        inp.close();
    }

    private static void electronicShop(int budget, Integer[] keyboards, Integer[] mouse) {
        int result = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < mouse.length; j++) {
                int price = keyboards[i]+mouse[j];
                if(price > result && price<=budget){
                    result = price;
                }
            }
        }
        System.out.println(result);
    }

    private static void electronicShop2(int budget, Integer[] keyboards, Integer[] mouse){
        Arrays.sort(keyboards, Collections.reverseOrder());//Descending order
        Arrays.sort(mouse);
        
        int max = -1;
        for(int i = 0, j = 0; i < keyboards.length; i++){
            for(; j < mouse.length; j++){
                if(keyboards[i]+mouse[j] > budget) break;
                if(keyboards[i]+mouse[j] > max)
                    max = keyboards[i]+mouse[j];
            }
        }
        System.out.println(max);
    }

}