import java.util.Scanner;


class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int start = inp.nextInt();
        int jump = inp.nextInt();
        int end = inp.nextInt();
        int money = inp.nextInt();

        halloweenSale(start, jump, end, money);

        inp.close();
    }

    private static void halloweenSale(int start, int jump, int end, int money) {
        int buy = 0;
        int pay = start;
        while(money>=pay){
            money-=pay;
            if(pay-jump>end){
                pay-=jump;
            }else{
                pay = end;
            }
            buy++;
        }
        System.out.println(buy);

    }
}