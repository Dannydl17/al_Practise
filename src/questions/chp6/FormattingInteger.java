package questions.chp6;

public class FormattingInteger {
    public static String canFormatInteger(int number, int width) {
        int num = number;
        String numCollected = "";
        if (width <= 1){
            numCollected = String.valueOf(num);
        }
        if (width == 2 || width == 3){
            numCollected += 0;
            numCollected += String.valueOf(num);
        }

        if (width == 4){
            for (int i = 0; i <=1; i++) {
                numCollected += 0;
            }
            numCollected += String.valueOf(num);
        }

        if (width == 5){
            for (int i = 0; i <= 2; i++) {
                numCollected += 0;
            }
            numCollected += String.valueOf(num);
        }
        return numCollected;
    }
}
