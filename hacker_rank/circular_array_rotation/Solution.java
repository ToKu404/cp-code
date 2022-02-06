import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int k = inp.nextInt();
        int q = inp.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        int query[] = new int[q];
        for (int i = 0; i < query.length; i++) {
            query[i] = inp.nextInt();
        }
        circularArrayRotation2(arr, k, query);
        inp.close();
    }

    private static void circularArrayRotation(int[] arr, int k, int[] query) {
        int rotation = 0;
        while (rotation < k) {
            int last = arr[arr.length-1];
            for (int i = arr.length-1; i > 0; i--) {    
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
            rotation ++;
        }
        for (int i = 0; i < query.length; i++) {
            System.out.println(arr[query[i]]);
        }
    }

    private static void circularArrayRotation2(int[] arr, int k, int[] query) {
        for (int i = 0; i < query.length; i++) {
            System.out.println(arr[(arr.length - (k % arr.length)+ query[i]) % arr.length]);
        }
    }

    private static void circularArrayRotation3(int[] arr, int k, int[] query) {
        int rotation = k % arr.length;
        for (int i = 0; i < query.length; i++) {
            if (query[i] - rotation >= 0){
                System.out.println(arr[query[i] - rotation]);
            }
            else {
                System.out.println(arr[query[i] - rotation + arr.length]);
            }
	    }
    }
}