import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int returnDate[] = new int[3];
        int dueDate[] = new int[3];

        for (int i = 0; i < returnDate.length; i++) {
            returnDate[i] = inp.nextInt();
        }

        for (int i = 0; i < dueDate.length; i++) {
            dueDate[i] = inp.nextInt();
        }

        libraryFine(returnDate, dueDate);
        
        inp.close();
    }

    private static void libraryFine(int[] returnDate, int[] dueDate) {
        int fine = 0;
        int dayReturn = (returnDate[2]*365) + (returnDate[1]*30) + returnDate[0];
        int dayDue = (dueDate[2]*365) + (dueDate[1]*30) + dueDate[0];
        if(dayReturn <= dayDue){
            fine = 0;
        }
        else if(returnDate[2] > dueDate[2]){
            fine = 10000;
        }
        else if(returnDate[1] > dueDate[1]){
            fine = 500 * (returnDate[1] - dueDate[1]);
        }else if (returnDate[0] > dueDate[0]){
            fine = 15 * (returnDate[0] - dueDate[0]);
        }
        System.out.println(fine);
    }
}