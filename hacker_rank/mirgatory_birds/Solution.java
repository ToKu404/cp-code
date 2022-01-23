import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int birds[] = new int[n];
        for (int i = 0; i < birds.length; i++) {
            birds[i] = inp.nextInt();
        }

        migratoryBirds(birds);
        inp.close();
    }

    static void migratoryBirds(int arr[]) {
        int ary[] = new int[arr.length];
        for(int i = 0; i < arr.length ; i++){
            // System.out.println(ary[arr[i]]);
            // using another array as index
            ary[arr[i]] = ary[arr[i]] + 1; 
        }
        int max = 0, maxpos=0;
        for(int i = 0 ; i < arr.length ; i++){
            if(ary[i] > max){
                max = ary[i];
                maxpos = i;
            }
        }
        System.out.println(maxpos);
    }

    // private static void migratoryBirds(int[] birds) {
    //     for (int i = 0; i < birds.length; i++) {
    //         for (int j = i+1; j < birds.length; j++) {
    //             if(birds[i]>birds[j]){
    //                 int temp = birds[i];
    //                 birds[i] = birds[j];
    //                 birds[j] = temp;
    //             }
    //         }
    //     }
    //     int maxBirds[] = {0,0};
    //     int temp = birds[0];
    //     int tempCount = 1;
    //     for (int i = 1; i < birds.length+1; i++) {
            
    //         if(i==birds.length){
    //             if(maxBirds[1]<tempCount){
    //                 maxBirds[0] = temp;
    //                 maxBirds[1] = tempCount;
    //             }
    //         }
    //         else if(temp == birds[i]){
    //             tempCount++;
    //         }else{
    //             if(maxBirds[1]<tempCount){
    //                 maxBirds[0] = temp;
    //                 maxBirds[1] = tempCount;
    //             }
    //             temp = birds[i];
    //             tempCount = 1;
    //         }
    //     }
    //     System.out.println(maxBirds[0]);
    // }
}
