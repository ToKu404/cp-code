import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        Long num[][] = new Long[n][5];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = inp.nextLong();
            }
        }

        taumBday(num);

        inp.close();
    }

    private static void taumBday(Long[][] num) {
        for (int i = 0; i < num.length; i++) {
            Long costB = (long) (num[i][0] * num[i][2]);
            Long costA = (long) (num[i][1] * num[i][3]);
            Long costChangeA = (long) ((num[i][4] * num[i][0]) + ((num[i][0]+num[i][1]) * num[i][3]));
            Long costChangeB = (long) ((num[i][4] * num[i][1]) + ((num[i][0]+num[i][1]) * num[i][2]));
            Long min;
            if(costA+costB <= costChangeA && costA+costB <= costChangeB){
                min = costA+costB;
            }else if (costChangeA <= costChangeB){
                min = costChangeA;
            }else{
                min = costChangeB;
            }
            System.out.println(min);
        }
    }

    private static void taumBday2(Long[][] num){
        for (int i = 0; i < num.length; i++) {
            Long x = num[i][2]>num[i][3]? ((num[i][2]-num[i][3]>num[i][4])? num[i][3]+num[i][4] : num[i][2]) : num[i][2];
            Long y = num[i][3]>num[i][2]? ((num[i][3]-num[i][2]>num[i][4])? num[i][2]+num[i][4] : num[i][3]) : num[i][3];
            System.out.println(num[i][0] * x + num[i][1] * y);
        }
        
    }
}