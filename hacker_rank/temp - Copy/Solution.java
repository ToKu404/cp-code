import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int num[] = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = inp.nextInt();
        }

        permutationEquation(num);

        inp.close();
    }

    private static void permutationEquation(int[] num) {
        int index[] = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            index[num[i]-1] = i+1;
        }
        for (int i = 0; i < index.length; i++) {
            for (int j = 0; j < index.length; j++) {
                if(index[i]==num[j]){
                    System.out.println((j+1));
                    break;
                }
            }
        }
    }
}