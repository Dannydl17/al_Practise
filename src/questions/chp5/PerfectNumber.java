package questions.chp5;

import java.util.ArrayList;

public class PerfectNumber {
    public static void main(String[] args) {
        ArrayList<Integer> collectN = new ArrayList<>();
        int total = 0;
        int countN = 2;
        int counter = 0;
        for (int count = 1; count < countN; count++) {
            if (countN < 1000){
                 if (countN % count == 0) {
                    total+= count;
                    counter++;
                }
            }
        }
        if (total == countN){
            collectN.add(total);
            countN+=1;
        }
    }
}
