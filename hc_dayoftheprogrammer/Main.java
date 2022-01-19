package hc_dayoftheprogrammer;
/**
 * HcDayOfTheProgrammer
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            int tahun = inp.nextInt();
            System.out.println(dayOfProgrammer(tahun));
        }
    }

    public static String dayOfProgrammer(int year) {
        // Write your code here
            if (year<1918 && year%4==0){
                return "12.09."+String.valueOf(year);
            }
            else if (year>1918 && year%400==0 || (year%4==0 && year%100!=0)){
                return "12.09."+String.valueOf(year);
            }
            else if (year==1918){
                return "26.09.1918";
            }else{
                return "13.09."+String.valueOf(year);
            }
    }
    
}