import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        minDistance(arr);

        inp.close();
    }

    private static void minDistance(int[] arr) {
        int min = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                
                if(arr[i]==arr[j]){
                    System.out.println(j);
                    System.out.println(i);
                    min = j-i < min || min==-1? j-i : min;
                }
            }
        }
        System.out.println(min);
    }
}