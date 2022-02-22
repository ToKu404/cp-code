import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int person[] = new int[n];
        int sum = 0;

        for (int i = 0; i < person.length; i++) {
            person[i] = inp.nextInt();
            sum+=person[i];
        }

        fairRotions(person, sum);

        inp.close();
    }

    private static void fairRotions(int[] person, int sum) {
        if(sum%2==1){
            System.out.println("NO");
        }else{
            int index = 0;
            int bread = 0;
            while(index < person.length-1){
                if(person[index]%2!=0){
                    person[index] ++;
                    person[index+1] ++;
                    bread+=2;
                }

                index++;
            }
            System.out.println(bread);
        }
    }
}