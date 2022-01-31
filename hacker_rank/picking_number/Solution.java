import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }

        pickingNumber(arr);
        inp.close();
    }

    private static void pickingNumber(int[] arr) {
        // Find Max Value
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        // Find Count Value
        int newArr[] = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr[i]]++;
        }
        // Find Max Array
        int maxArray = newArr[0] + newArr[1];
        for (int i = 1; i < newArr.length-1; i++) {
            if(maxArray < (newArr[i] + newArr[i+1])){
                maxArray = (newArr[i] + newArr[i+1]);
            }
        }
        System.out.println(maxArray);
    }
}