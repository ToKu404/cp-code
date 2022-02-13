import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int hours = inp.nextInt();
        
        String minutes = inp.next();
        // System.out.println();

        timeWords(hours, minutes);

        inp.close();

    }



    private static String timeToWords(int time, boolean isHours){
        Map<Integer, String> wordsNum = new HashMap<>();

        int num [] = {1,2,3,4,5,6,7,8,9,10,0,11,12,13,15,20};
        String words [] = {"one", "two", "three", "four", "five", "six","seven", "eight", "nine", "ten","teen", "eleven", "twelve", "thirteen","fifteen","twenty"};
        for (int i = 0; i < words.length; i++) {
            wordsNum.put(num[i], words[i]);
        }

        if(isHours){
            return wordsNum.get(time);
        }else{
            String minutesName = "";
            int rightMin = time%10;
            if(time==0){
            }
            else if (time<=10) {
                minutesName = wordsNum.get(time);
            }
            else if(time==15){
                minutesName = "quarter past";
            }
            else if(time==30){
                minutesName = "half past";
            }
            else if(time==45){
                minutesName = "quarter to";
            }
            else if ((int)time/10==1){
                if(rightMin==1 || rightMin==2 || rightMin==3 || rightMin==5){
                    minutesName = wordsNum.get(time);
                }else{
                    minutesName = wordsNum.get(rightMin) + wordsNum.get(0);
                }
            }else if(time==20){
                minutesName = wordsNum.get(time);
            }else{
                minutesName =  wordsNum.get(20) + " " +  wordsNum.get(rightMin);
            }

            return minutesName;
        }
    }

    private static void timeWords(int hours, String minutes) {
        
        int minutesNum = Integer.valueOf(minutes);
    
        if(minutesNum==0){
            System.out.println(timeToWords(hours, true) + " o' clock");
        }
        else if(minutesNum==15){
            System.out.println(timeToWords(minutesNum, false) + " " + timeToWords(hours, true));
        }else if(minutesNum==30){
            System.out.println(timeToWords(minutesNum, false) + " " + timeToWords(hours, true));
        }
        else if(minutesNum==45){
            System.out.println(timeToWords(minutesNum, false) + " " + timeToWords(hours+1, true));
        }
        else if(minutesNum<30){
            String minutesName = minutesNum<10?"minute":"minutes";
            System.out.println(timeToWords(minutesNum, false) + " " + minutesName + " past " + timeToWords(hours, true));
        }else if(minutesNum>30){
            System.out.println(timeToWords(60-minutesNum, false) + " minutes to " + timeToWords(hours+1, true));
        }
    }
}

