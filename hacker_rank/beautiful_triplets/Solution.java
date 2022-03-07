import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int d = inp.nextInt();

        int num[] = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = inp.nextInt();
        }

        beautifulTriplets(num, d);

<<<<<<< HEAD
=======

>>>>>>> 017175bb3fcd7aaa39a8bae221cff0e6820e9a54
        inp.close();
    }

    private static void beautifulTriplets(int[] num, int d) {
        int beautifulTriplets = 0;
        for (int i = 0; i < num.length; i++) {
            Boolean found1 = false;
            Boolean found2 = false;
            System.out.print(num[i] + " ");
            for (int j = i+1; j < num.length; j++) {
                if(num[j]-num[i]==d && !found1){
                    found1=!found1;
                    System.out.print(num[j] + " ");
                }
                if(num[j]-num[i]==d+d && !found2){
                    found2=!found2;
                    System.out.print(num[j] + " ");

                }
            }
            System.out.println();
            if(found1 && found2){
                beautifulTriplets++;
            }
        }
        System.out.println(beautifulTriplets);
    }
}