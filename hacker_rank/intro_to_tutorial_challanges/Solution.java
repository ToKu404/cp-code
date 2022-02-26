import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int v = inp.nextInt();
        int n = inp.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }

        introTutorialChallanges(arr, v);


        inp.close();
    }

    private static void introTutorialChallanges(int[] arr, int v) {
        int find = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==v){
                find = i;
            }
        }
        System.out.println(find);
    }
}