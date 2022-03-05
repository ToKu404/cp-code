import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        for (int i=0; i<t; i++){
            int n = inp.nextInt();
            int[] a = new int[n];
            for (int j=0; j<n; j++){
                a[j]=inp.nextInt();
            }
            bubleSort(a,n);
            System.out.println(a[n-2]<a[n-1]?"YES":"NO");
        }
        inp.close();
    }
    
    public static void bubleSort(int[] array, int n){
        for (int i=0; i<n-2; i++){
            for (int j=n-2-1; j>=i; j--){
                while (array[j]>array[j+1]||array[j]>array[j+2]) {
                    rotate(array,j);
                }
            }
        }
    }
    
    public static void rotate(int[] arr, int a){
        int temp = arr[a];
        arr[a] = arr[a+1];
        arr[a+1] = arr[a+2];
        arr[a+2] = temp;
    }
}