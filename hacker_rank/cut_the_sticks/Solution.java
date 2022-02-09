import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int sticks[] = new int[n];

        for (int i = 0; i < sticks.length; i++) {
            sticks[i] = inp.nextInt();
        }

        cutSticks(sticks);
        inp.close();
    }

    private static void cutSticks(int[] sticks) {
        for (int i = 0; i < sticks.length; i++) {
            for (int j = i+1; j < sticks.length; j++) {
                int temp = 0;
                if(sticks[i]>sticks[j]){
                    temp = sticks[i];
                    sticks[i] = sticks[j];
                    sticks[j] = temp;
                }
            }
        }
        int shortStick = sticks[0];
        int length = 1;
        int cutStick = sticks.length;
        for (int i = 1; i <= sticks.length; i++) {
            if(i==sticks.length){
                System.out.println(cutStick);
            }
            else if(sticks[i]==shortStick){
                length++;
            }else{
                System.out.println(cutStick);
                cutStick -= length;//3
                length=1;
                shortStick = sticks[i];//4
            }
        }
       
    }

    private static void cutSticks2(int[] sticks) {
        for (int i = 0; i < sticks.length; i++) {
            for (int j = i+1; j < sticks.length; j++) {
                int temp = 0;
                if(sticks[i]>sticks[j]){
                    temp = sticks[i];
                    sticks[i] = sticks[j];
                    sticks[j] = temp;
                }
            }
        }
        System.out.println(sticks.length);
        for (int i = 1; i < sticks.length; i++) {
            if (sticks[i] != sticks[i-1]) {
                System.out.println(sticks.length - i);
            }
        }
    }
}