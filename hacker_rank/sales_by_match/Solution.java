import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int n = inp.nextInt();

        int socks[] = new int[n];

        for (int i = 0; i < socks.length; i++) {
            socks[i] = inp.nextInt();
        }

        sockMerchantt(socks);

        inp.close();
    }

    private static void sockMerchantt(int[] socks) {
        int couple = 0;
        for (int i = 0; i < socks.length; i++) {
            for (int j = i; j < socks.length; j++) {
                if(socks[i]>socks[j]){
                    int temp = socks[i];
                    socks[i] = socks[j];
                    socks[j] = temp;
                }
            }
        }
        
        int temp = socks[0];
        int countTemp = 1;
        
        for (int i = 1; i <= socks.length+1; i++) {
            if(i == socks.length){
                couple += Integer.valueOf(countTemp/2);
                break;
            }
            if(temp != socks[i]){
                // System.out.println("ct : "+countTemp);
                couple += Integer.valueOf(countTemp/2);
                temp = socks[i];
                countTemp = 1;
            }else{
                countTemp++;
            }
            
            // if(countTemp == 2){
            //     couple++;
            //     temp = socks[i];
            //     countTemp=1;
            // }
            // else if(temp == socks[i]){
            //     countTemp++;
            // }else{
            //     temp = socks[i];
            //     countTemp=1;
            // }
        }
        System.out.println(couple);
    }
}